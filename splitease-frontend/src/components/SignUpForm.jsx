export default function SignUpForm(){
    return (<div className="signUpForm">
        <p className="signUpTitle">Create Your Account</p>
        <input className="FormInput" type="text" placeholder="Name" />
        <input className="FormInput" type="text" placeholder="Email"/>
        <input className="FormInput" type="text" placeholder="Phone Number"/>
        <input className="FormInput" type="text" placeholder="Password"/>
        <input className="FormInput" type="text" placeholder="Confirm Password"/>
        <button className="FormButton">Sign Up</button>
    </div>);
}