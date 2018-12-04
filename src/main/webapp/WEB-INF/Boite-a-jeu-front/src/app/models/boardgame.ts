import {Review} from './review';

export class Boardgame {
    id: number;
    name: string;
    dateEdition: Date;
    age: string;
    nbPlayer: string;
    playTime: string;
    rating: number;
    reviews: Review[];
}
