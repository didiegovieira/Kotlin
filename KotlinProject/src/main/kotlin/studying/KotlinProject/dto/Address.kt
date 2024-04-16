package studying.KotlinProject.dto

class Address {
    private var city: String? = null;

    private var neighborhood: String? = null;

    private var state: String? = null;

    private var zipcode: String? = null;

    private var address: String? = null;

    private var number: String? = null;

    private var complement: String? = null;

    private var lat: Double? = null;

    private var lng: Double? = null;

    constructor(
        city: String?,
        neighborhood: String?,
        state: String?,
        zipcode: String?,
        address: String?,
        number: String?,
        complement: String?,
        lat: Double?,
        lng: Double?
    ) {
        this.city = city
        this.neighborhood = neighborhood
        this.state = state
        this.zipcode = zipcode
        this.address = address
        this.number = number
        this.complement = complement
        this.lat = lat
        this.lng = lng
    }

    fun getCity(): String? {
        return this.city;
    }

    fun setCity(city: String?){
        this.city = city;
    }

    fun getNeighborhood(): String? {
        return this.neighborhood;
    }

    fun setNeighborhood(neighborhood: String?) {
        this.neighborhood = neighborhood;
    }

    fun getState(): String? {
        return this.state;
    }

    fun setState(state: String?) {
        this.state = state;
    }

    fun getZipcode(): String? {
        return this.zipcode;
    }

    fun setZipcode(zipcode: String?) {
        this.zipcode = zipcode;
    }

    fun getAddress(): String? {
        return this.address;
    }

    fun setAddress(address: String?) {
        this.address = address;
    }

    fun getNumber(): String? {
        return this.number;
    }

    fun setNumber(number: String?) {
        this.number = number;
    }

    fun getComplement(): String? {
        return this.complement;
    }

    fun setComplement(complement: String?) {
        this.complement = complement;
    }

    fun getLat(): Double? {
        return this.lat;
    }

    fun setLat(lat: Double?) {
        this.lat = lat;
    }

    fun getLng(): Double? {
        return this.lng;
    }

    fun setLng(lng: Double?) {
        this.lng = lng;
    }

}