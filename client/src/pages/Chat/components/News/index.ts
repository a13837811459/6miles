import News from './view';
export default News;

export interface IProps {
  type: 0 | 1;
  text: string;
  time: number;
  avatar: string;
}
