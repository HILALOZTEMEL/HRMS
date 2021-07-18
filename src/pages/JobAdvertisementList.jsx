import React, { useState, useEffect } from "react"
import { Icon, Menu, Table } from 'semantic-ui-react'
import JobAdvertisementService from "../services/jobAdvertisementService"



export default function JobAdvertisementList() {

    const[jobAdvertisements, setJobAdvertisements]=useState([])

    useEffect(() => {
        let jobAdvertisementService=new JobAdvertisementService()
        jobAdvertisementService.getJobAdvertisements().then((result)=>setJobAdvertisements(result.data.data))
    }, [])
    
    

    return(
        <div>iş ilanları
                <Table celled>
                    <Table.Header>
                        <Table.Row>
                            <Table.HeaderCell>Id</Table.HeaderCell>
                            <Table.HeaderCell>İş Tanımı</Table.HeaderCell>
                            <Table.HeaderCell>Minimum Maaş</Table.HeaderCell>
                            <Table.HeaderCell>Maximum Maaş</Table.HeaderCell>
                            <Table.HeaderCell>Açık Pozisyon Sayısı</Table.HeaderCell>
                            <Table.HeaderCell>Son Başvuru Tarihi </Table.HeaderCell>
                            <Table.HeaderCell>İlan Tarihi</Table.HeaderCell>
                            <Table.HeaderCell>Aktiflik durumu</Table.HeaderCell>
                        </Table.Row>
                    </Table.Header>
    
                    <Table.Body>
                        
                            {jobAdvertisements?.map((jobAdvertisement) => (
                                <Table.Row key={jobAdvertisement.userId}>
                                    <Table.Cell>{jobAdvertisement.jobDescription}</Table.Cell>
                                    <Table.Cell>{jobAdvertisement.minSalary}</Table.Cell>
                                    <Table.Cell>{jobAdvertisement.maxSalary}</Table.Cell>
                                    <Table.Cell>{jobAdvertisement.numberOfOpenPositions}</Table.Cell>
                                    <Table.Cell>{jobAdvertisement.applicationDeadline}</Table.Cell>
                                    <Table.Cell>{jobAdvertisement.postedDate}</Table.Cell>
                                    <Table.Cell>{jobAdvertisement.isActive}</Table.Cell>
                                    <Table.Cell>{jobAdvertisement.City.city}</Table.Cell>
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