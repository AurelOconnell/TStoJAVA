// import { Address } from './address';
// import { Photo } from './photo';

// export class User {
//     birthdate: Date;
//     size: number;
//     photos: Photo[];
//     address: Address; 
// }

import java.util.Address;
import java.util.Photo;

public class User {
    private Date birthdate;
    private int size;
    private Photo photos;
    private Address address;
}

public Date getBirthdate() {
    return birthdate
}

public void setBirthdate(Date birthdate) {
    this.birthdate = birthdate;
}

public int getSize() {
    return size
}

public void setSize(double size) {
    this.size = size
}

public Photo getPhotos() {
    return photos
}

public void setPhotos(Photo photos) {
    this.photos = photos
}

public Address getAddress() {
    return address
}

public void setAddress(Address address) {
    this.address = address
}

