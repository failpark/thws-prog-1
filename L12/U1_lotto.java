public class U1_lotto {
	public static void main(String[] args) {
		int size = 49;
		LottoNum start = populate_LottoNum(size);
		LottoNum picked_start = pick_LottoNum(get_random(size), start);
		size--;
		for (int i = 0; i < 6; i++) {
			LottoNum prev = picked_start;
			LottoNum tmp = picked_start;
			LottoNum current_pick = pick_LottoNum(get_random(size), start);
			while(true) {
				if (current_pick.num < tmp.num) {
					current_pick.next = tmp;
					// choose what to do with the prev ref
					// if prev == picket start then we know that our head is now our current_pick
					// if not we insert it into the list and should reset our pointer of prev.next to our current pick
					if (tmp.num == picked_start.num) {
						picked_start = current_pick;
					} else {
						prev.next = current_pick;
					}
					break;
				} else if (tmp.next == null) {
					tmp.next = current_pick;
					break;
				}
				prev = tmp;
				tmp = tmp.next;
			}
			size--;
		}
		print_list(picked_start);
		System.out.println("------------");
		print_list(start);
		// System.exit(0);
	}

	private static void print_list(LottoNum list) {
		LottoNum start = list;
		while (list.next != null) {
			System.out.println(list.num);
			list = list.next;
		}
		list = start;
	}

	private static int get_random(int size) {
		// return (int)Math.random() * size;
		int tmp = (int)(Math.random() * size);
		return tmp;
	}

	private static LottoNum populate_LottoNum(int size) {
		LottoNum start = new LottoNum(1);
		LottoNum tmp = start;
		for (int i = 2; i <= size; i++) {
			tmp.next = new LottoNum(i);
			tmp = tmp.next;
		}
		return start;
	}

	// we only need to return our pick since we pass start by ref
	private static LottoNum pick_LottoNum(int pos, LottoNum start) {
		if (pos < 0) {
			throw new RuntimeException("Invalid pos provided");
		}
		LottoNum prev = start;
		LottoNum pick = start;
		while(pos != 0) {
			prev = pick;
			pick = pick.next;
			pos--;
		}
		prev.next = pick.next;
		pick.next = null;
		return pick;
	}
}