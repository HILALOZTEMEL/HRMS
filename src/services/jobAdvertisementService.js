import axios from "axios"

export default class jobAdvertisementService{
    getJobAdvertisements() {
        return axios.get("http://localhost:8080/api/JobAdvertisements/getall")
    }
}