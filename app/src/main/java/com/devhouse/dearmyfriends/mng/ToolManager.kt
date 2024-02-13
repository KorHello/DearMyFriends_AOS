package com.devhouse.dearmyfriends.mng

class ToolManager {
    companion object {
        val shared = ToolManager()
    }

    /**
     * 스트링인지 여부 판단
     */
    fun checkMapString(data: Any?, defaultStr: String = ""): String {
        var returnStr = defaultStr

        if(data != null && data as String != null) {
            returnStr = data as String
        }

        return returnStr
    }
}