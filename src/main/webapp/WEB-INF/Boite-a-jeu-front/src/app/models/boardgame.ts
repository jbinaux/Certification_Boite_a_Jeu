import {Review} from './review';

export class Boardgame {
    name: string;
    dateEdition: Date;
    age: string;
    nbPlayer: string;
    playTime: string;
    rating: number;
    reviews: Review[];
}
