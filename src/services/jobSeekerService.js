import axios from "axios"

export default class jobSeekerService{
    getJobSeekers() {
        return axios.get("http://localhost:8080/api/http://localhost:8080/api/JobSeekers/getall")
    }
}