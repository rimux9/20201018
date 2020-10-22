package rimantas.ndFurniture;

import java.util.List;

    public class House {

        private ListRoom RoomList;

        public House(ListRoom roomList) {
            RoomList = roomList;
        }

        public House(List<Room> roomsList) {
        }

        public ListRoom getRoomList() {
            return RoomList;
        }

        public void setRoomList(ListRoom roomList) {
            RoomList = roomList;
        }
        public String toString() {
            return "House" + RoomList;
        }
    }
