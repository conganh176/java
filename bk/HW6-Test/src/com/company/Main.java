//Trong nút nguồn có 01 bộ hàng đợi (queue), 01 bộ đệm đầu ra (eXB) dùng để lưu trữ các Packet.
//Trong nút trung gian có 4 bộ đệm đầu vào (eNB - entrance buffer),
//và 4 bộ đệm đầu ra (eXB - exit buffer) cũng để lưu trữ các Packet.
//Bộ hàng đợi là một danh sách liên kết không có kích thước giới hạn.
// Còn mỗi bộ đệm đầu ra và mỗi bộ đệm đầu vào là những mảng có kích thước bằng 5.
// iả sử nút đích không cần bất kỳ loại bộ đệm hoặc hàng đợi nào.
//Giữa các nút có đường dẫn (Link) giúp kết nối chúng với nhau.
//Một Host chỉ kết nối với một đường dẫn (Link), các nút Switch kết nối với 4 đường dẫn (Link).
// Một đường dẫn (Link) kết nối giữa hai nút (Host hoặc Switch) với nhau.
// Tại một thời điểm có tối đa hai gói tin Packet đi trên một đường kết nối. Lớp Link có nội dung như sau:

//class Link{
//    public Host host; //Nếu đường dẫn nối 2 switch với nhau thì host= null
//    public Switch sws[ ] = new Switch[2];//nếu đường dẫn nối một
//    //switch với host thì sws[1] = null
//    public int from[ ] = new int[2]; //lưu trữ id của hai nút
//    public int to[ ] = new int[2]; //lưu trữ id của hai nút.
//    // Rõ ràng from[0] = to[1] và to[0] = from[1]
//    public Packet pkt[ ] = new Packet[2];//nếu có gói tin đi từ from[X] đến to[X]
//    //thì pkt[X] !=  null, nếu không có
////thì pkt[X] = null
//    public Packet[ ] getENB(int id) { … }
//    //Hàm này trả về danh sách gói tin trong ENB của switch kế tiếp mà nút có id
//    //kia có kết nối đến
//}
//Để đơn giản, khi khởi tạo ra một đối tượng của lớp Packet, SV chỉ cần gọi đến hàm
//public Packet createPacket( )
//Giả sử hàm removeQueue( ) sẽ trả về Packet ở vị trí đầu tiên trong queue và xóa đi phần tử đó trong queue
//Giả sử hàm position(Packet[] EXB) sẽ trả về vị trí còn trống (tức phần tử null có chỉ số bé nhất) trong mảng EXB,
// nếu EXB đầy (tức tất cả các phần tử đều khác null) sẽ trả về -1.

package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
