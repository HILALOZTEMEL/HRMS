import React , { useState, useEffect} from 'react'
import { Icon, Menu, Table } from 'semantic-ui-react'
import SystemPersonelService from '../services/systemPersonelService';

export default function SystemPersonelList() {

const[systemPersonels, setSystemPersonels]=useState([])

useEffect(() => {
    let systemPersonelService=new SystemPersonelService()
    systemPersonelService.getSystemPersonels().then((result)=>setSystemPersonels(result.data.data))
    }, [])
      

    return (
        <div>System Personel list
            <Table celled>
                <Table.Header>
                    <Table.Row>
                        <Table.HeaderCell>id</Table.HeaderCell>
                        <Table.HeaderCell>Departman</Table.HeaderCell>
                    </Table.Row>
                </Table.Header>

                <Table.Body>
                    
                        {systemPersonels.map((systemPersonel) => (
                            <Table.Row key={systemPersonel.id}>
                                <Table.Cell>{systemPersonel.departman}</Table.Cell>
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