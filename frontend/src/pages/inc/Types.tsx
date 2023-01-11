type Employee = {
    id?: number,
    username: string,
    first_name: string,
    last_name: string,
    email: string,
    phone_number: string,
    zip_code: number,
    status?:string
};

type LoginFormFields = {
    email: string;
    password: string;
};

type Response = {
    status: number;
    message?: string;
    errors?: never[];
};

type SignupFormFields = {
    email: string;
    password: string;
    password_confirmation: string;
    first_name: string;
    last_name: string;
    username: string;
    phone_number: string;
    zip_code: string;
};

export type {Employee,  LoginFormFields, SignupFormFields, Response}