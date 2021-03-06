package com.snowcattle.game.wolfshoot.service.net;

import com.snowcattle.game.common.constant.BOEnum;

public enum GameMessageCommandEnum {

    ONLINE_HEART_MESSAGE(GameMessageCommandIndex.ONLINE_HEART_CLIENT_TCP_MESSAGE, BOEnum.WORLD,false),
    COMMON_RESPONSE_MESSAGE(GameMessageCommandIndex.COMMON_RESPONSE_MESSAGE, BOEnum.WORLD, false),
    COMMON_ERROR_RESPONSE_MESSAGE(GameMessageCommandIndex.COMMON_ERROR_RESPONSE_MESSAGE, BOEnum.WORLD, false),
    ONLINE_HEART_UDP_MESSAGE(GameMessageCommandIndex.ONLINE_HEART_CLIENT_UDP_MESSAGE, BOEnum.WORLD, true),
    ONLINE_LOGIN_TCP_CLIENT_MESSAGE(GameMessageCommandIndex.ONLINE_LOGIN_TCP_CLIENT_MESSAGE, BOEnum.WORLD,false),
    ONLINE_LOGIN_TCP_SERVER_MESSAGE(GameMessageCommandIndex.ONLINE_LOGIN_TCP_SERVER_MESSAGE, BOEnum.WORLD,false),
    ;
    /**
     * 协议号
     */
    public final int command_id;

    /**
     * boconstant的id
     */
    public final int bo_id;

    /**
     * 是否需要过滤
     */
    public final boolean is_need_filter;

    GameMessageCommandEnum(int commandId, BOEnum boEnum, boolean is_need_filter) {
        this.command_id = commandId;
        this.bo_id = boEnum.getBoId();
        this.is_need_filter = is_need_filter;
    }

    public static String getMessageCommandName(int commandId) {
        GameMessageCommandEnum commands = GameMessageCommandEnum.ONLINE_HEART_MESSAGE;
        GameMessageCommandEnum[] set = commands.values();
        for (int i = 0; i < set.length; i++) {
            GameMessageCommandEnum tempCommand = set[i];
            if (tempCommand.command_id == commandId) {
                commands = tempCommand;
                break;
            }
        }
        return commands.name();

    }

    public static GameMessageCommandEnum getMessageCommand(int commandId) {
        GameMessageCommandEnum commands = GameMessageCommandEnum.ONLINE_HEART_MESSAGE;
        GameMessageCommandEnum[] set = commands.values();
        for (int i = 0; i < set.length; i++) {
            GameMessageCommandEnum tempCommand = set[i];
            if (tempCommand.command_id == commandId) {
                commands = tempCommand;
                break;
            }
        }
        return commands;

    }

    public static int getBoIdByCommandId(int commandId) {
        GameMessageCommandEnum commands = GameMessageCommandEnum.ONLINE_HEART_MESSAGE;
        GameMessageCommandEnum[] set = commands.values();
        for (int i = 0; i < set.length; i++) {
            GameMessageCommandEnum tempCommand = set[i];
            if (tempCommand.command_id == commandId) {
                commands = tempCommand;
                break;
            }
        }
        return commands.bo_id;
    }

}
