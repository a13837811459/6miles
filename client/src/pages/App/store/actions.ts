import * as actionTypes from './actionTypes';

export type Type = Action | UserinfoAction;

export interface Action {
  type: actionTypes.CHANGE_LOGIN_MODAL | actionTypes.CHANGE_REGISTER_MODAL
}
// 登陆框
export const changeLoginModalAction = (): Action => ({
  type: actionTypes.CHANGE_LOGIN_MODAL,
});
// 注册框
export const changeRegisterModalAction = (): Action => ({
  type: actionTypes.CHANGE_REGISTER_MODAL,
});

export interface UserinfoAction {
  value: any,
  type: actionTypes.SET_USER_INFO
}
 //存取用户信息
 export const setUserInfo = (value:any) => ({
   type: actionTypes.SET_USER_INFO,
   value:value
 });