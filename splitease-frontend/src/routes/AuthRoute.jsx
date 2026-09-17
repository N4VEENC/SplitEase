import {BrowserRouter,Routes,Route} from 'react-router-dom'
import SignUp from '../components/SignUp'
export default function AuthRoute(){
    return <BrowserRouter>
        <Routes>
            <Route path='/signup' element={<SignUp/>}/>
        </Routes>
    </BrowserRouter>
}