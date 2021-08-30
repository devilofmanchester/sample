
public class CommonUtil {
	public static String rename(String stName) {
		if (stName != null) {
			stName = stName.trim();
			for (int i = 0; i < stName.length(); ++i) {
				char c = stName.charAt(i);
				int j = (int) c;
				switch (j) {
				case 224:
				case 225:
				case 7843:
				case 227:
				case 7841:
				case 259:
				case 7857:
				case 7855:
				case 7859:
				case 7861:
				case 7863:
				case 226:
				case 7847:
				case 7845:
				case 7849:
				case 7851:
				case 7853:
				case 97: {
					stName = stName.replace(stName.charAt(i), 'a');
				}
					break;
				case 65:
				case 192:
				case 193:
				case 7842:
				case 195:
				case 7840:
				case 258:
				case 7856:
				case 7854:
				case 7858:
				case 7860:
				case 7862:
				case 194:
				case 7846:
				case 7844:
				case 7848:
				case 7850:
				case 7852: {
					stName = stName.replace(stName.charAt(i), 'A');
				}
					break;
				case 98: {
					stName = stName.replace(stName.charAt(i), 'b');
				}
					break;
				case 66: {
					stName = stName.replace(stName.charAt(i), 'B');
				}
					break;
				case 99: {
					stName = stName.replace(stName.charAt(i), 'c');
				}
					break;
				case 67: {
					stName = stName.replace(stName.charAt(i), 'C');
				}
					break;
				case 273:
				case 100: {
					stName = stName.replace(stName.charAt(i), 'd');
				}
					break;
				case 272:
				case 68: {
					stName = stName.replace(stName.charAt(i), 'D');
				}
					break;
				case 101:
				case 232:
				case 233:
				case 7867:
				case 7869:
				case 7865:
				case 234:
				case 7873:
				case 7871:
				case 7875:
				case 7877:
				case 7879: {
					stName = stName.replace(stName.charAt(i), 'e');
				}
					break;
				case 69:
				case 200:
				case 201:
				case 7866:
				case 7868:
				case 7864:
				case 202:
				case 7872:
				case 7870:
				case 7874:
				case 7876:
				case 7878: {
					stName = stName.replace(stName.charAt(i), 'E');
				}
					break;
				case 102: {
					stName = stName.replace(stName.charAt(i), 'f');
				}
					break;
				case 70: {
					stName = stName.replace(stName.charAt(i), 'F');
				}
					break;
				case 103: {
					stName = stName.replace(stName.charAt(i), 'g');
				}
					break;
				case 71: {
					stName = stName.replace(stName.charAt(i), 'G');
				}
					break;
				case 104: {
					stName = stName.replace(stName.charAt(i), 'h');
				}
					break;
				case 72: {
					stName = stName.replace(stName.charAt(i), 'H');
				}
					break;
				case 105:
				case 236:
				case 237:
				case 7881:
				case 297:
				case 7883: {
					stName = stName.replace(stName.charAt(i), 'i');
				}
					break;
				case 73:
				case 204:
				case 205:
				case 7880:
				case 296:
				case 7882: {
					stName = stName.replace(stName.charAt(i), 'I');
				}
					break;
				case 106: {
					stName = stName.replace(stName.charAt(i), 'j');
				}
					break;
				case 74: {
					stName = stName.replace(stName.charAt(i), 'J');
				}
					break;
				case 107: {
					stName = stName.replace(stName.charAt(i), 'k');
				}
					break;
				case 75: {
					stName = stName.replace(stName.charAt(i), 'K');
				}
					break;
				case 108: {
					stName = stName.replace(stName.charAt(i), 'l');
				}
					break;
				case 76: {
					stName = stName.replace(stName.charAt(i), 'L');
				}
					break;
				case 109: {
					stName = stName.replace(stName.charAt(i), 'm');
				}
					break;
				case 77: {
					stName = stName.replace(stName.charAt(i), 'M');
				}
					break;
				case 110: {
					stName = stName.replace(stName.charAt(i), 'n');
				}
					break;
				case 78: {
					stName = stName.replace(stName.charAt(i), 'N');
				}
					break;
				case 111:
				case 242:
				case 243:
				case 7887:
				case 245:
				case 7885:
				case 244:
				case 7891:
				case 7889:
				case 7893:
				case 7895:
				case 7897:
				case 417:
				case 7901:
				case 7899:
				case 7903:
				case 7905:
				case 7907: {
					stName = stName.replace(stName.charAt(i), 'o');
				}
					break;
				case 79:
				case 210:
				case 211:
				case 7886:
				case 213:
				case 7884:
				case 212:
				case 7890:
				case 7888:
				case 7892:
				case 7894:
				case 7896:
				case 416:
				case 7900:
				case 7898:
				case 7902:
				case 7904:
				case 7906: {
					stName = stName.replace(stName.charAt(i), 'O');
				}
					break;
				case 117:
				case 249:
				case 250:
				case 7911:
				case 361:
				case 7909:
				case 432:
				case 7915:
				case 7913:
				case 7917:
				case 7919:
				case 7921: {
					stName = stName.replace(stName.charAt(i), 'u');
				}
					break;
				case 85:
				case 217:
				case 218:
				case 7910:
				case 360:
				case 7908:
				case 431:
				case 7914:
				case 7912:
				case 7916:
				case 7918:
				case 7920: {
					stName = stName.replace(stName.charAt(i), 'U');
				}
					break;
				case 118: {
					stName = stName.replace(stName.charAt(i), 'v');
				}
					break;
				case 86: {
					stName = stName.replace(stName.charAt(i), 'V');
				}
					break;
				case 119: {
					stName = stName.replace(stName.charAt(i), 'w');
				}
					break;
				case 87: {
					stName = stName.replace(stName.charAt(i), 'W');
				}
					break;
				case 120: {
					stName = stName.replace(stName.charAt(i), 'x');
				}
					break;
				case 88: {
					stName = stName.replace(stName.charAt(i), 'X');
				}
					break;
				case 121:
				case 7923:
				case 253:
				case 7927:
				case 7929:
				case 7925: {
					stName = stName.replace(stName.charAt(i), 'y');
				}
					break;
				case 89:
				case 7922:
				case 221:
				case 7926:
				case 7928:
				case 7924: {
					stName = stName.replace(stName.charAt(i), 'Y');
				}
					break;
				case 122: {
					stName = stName.replace(stName.charAt(i), 'z');
				}
					break;
				case 90: {
					stName = stName.replace(stName.charAt(i), 'Z');
				}
					break;
				default:
					break;
				}
			}

			stName = stName.replace('?', '_');
			stName = stName.replace('.', '_');
			stName = stName.replace('`', '_');
			stName = stName.replace(' ', '_');
			stName = stName.replace(',', '_');
			stName = stName.replace('/', '_');
			stName = stName.replace(':', '_');
			stName = stName.replace('^', '_');
			stName = stName.replace(';', '_');
			stName = stName.replace('\\', '_');
			stName = stName.replace('\'', '_');
		} else {
			stName = "";
		}
		return stName;
	}
}
