import axios from "axios"

export default class systemPersonelService{
    getSystemPersonels() {
        return axios.get("http://localhost:8080/api/SystemPersonels/getall")
    }
}