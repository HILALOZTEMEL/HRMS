import React from 'react'
import Categories from './Categories'
import { Grid } from 'semantic-ui-react'
import EmployerList from '../pages/EmployerList'
import JobSeekerList from '../pages/JobSeekerList'
import SystemPersonelList from '../pages/SystemPersonelList'
import JobAdvertisementList from '../pages/JobAdvertisementList'
export default function Dashboard() {
    return (
        <div>
            <Grid  >
                <Grid.Row>
                    <Grid.Column width={4}>
                        <Categories />
                    </Grid.Column>          

               
                    <Grid.Column width={12}>
                       <EmployerList/>
                       <JobAdvertisementList/>
                       <JobSeekerList/>
                       <SystemPersonelList/>
                    </Grid.Column>
                </Grid.Row>
                
            </Grid>

        </div>
    )
}
