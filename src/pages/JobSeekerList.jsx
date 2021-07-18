import React, { useState, useEffect } from "react"
import { Icon, Menu, Table } from 'semantic-ui-react'
import JobSeekerService from "../services/jobSeekerService"

export default function JobSeekerList() {

    const[jobseekers, setJobSeekers] =useState([])

    useEffect(()=>{
    let jobSeekerService=new JobSeekerService()
    jobSeekerService.getJobSeekers().then((result)=>setJobSeekers(result.data.data))
}, [])
return(
    <div>İŞ ARAYAN LİST
            <Table celled> 
                <Table.Header>
                    <Table.Row>
                        <Table.HeaderCell>Ad</Table.HeaderCell>
                        <Table.HeaderCell>Soyad</Table.HeaderCell>
                        <Table.HeaderCell>Doğum Tarihi</Table.HeaderCell>
                        <Table.HeaderCell>Email</Table.HeaderCell>
                    </Table.Row>
                </Table.Header>

                <Table.Body>
                    
                        {jobseekers.map((jobSeeker) => (
                            <Table.Row key={jobSeeker.id}>
                                <Table.Cell>{jobSeeker.firstName}</Table.Cell>
                                <Table.Cell>{jobSeeker.lastName}</Table.Cell>
                                <Table.Cell>{jobSeeker.birthYear}</Table.Cell>
                                <Table.Cell>{jobSeeker.email}</Table.Cell>
                            </Table.Row>
                        ))}

                </Table.Body>

                <Table.Footer>
                    <Table.Row>
                        <Table.HeaderCell colSpan='3'>
                            <Menu floated='right' pagination>
                                <Menu.Item as='a' icon>
                                    <Icon name='chevron left' />
                                </Menu.Item>
                                <Menu.Item as='a'>1</Menu.Item>
                                <Menu.Item as='a'>2</Menu.Item>
                                <Menu.Item as='a'>3</Menu.Item>
                                <Menu.Item as='a'>4</Menu.Item>
                                <Menu.Item as='a' icon>
                                    <Icon name='chevron right' />
                                </Menu.Item>
                            </Menu>
                        </Table.HeaderCell>
                    </Table.Row>
                </Table.Footer>
            </Table>
        </div>
)
}