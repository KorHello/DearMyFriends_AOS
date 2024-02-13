package com.devhouse.dearmyfriends.item

import com.devhouse.dearmyfriends.mng.ToolManager

data class Sentence (
    var sentenceId: String = "",
    var content: String = "",
    var writer: String = "",
    var bgImgUrl: String = "",
    var likeCnt: String = "",
    var bgCurrentImg: String = ""
) {
    constructor(data: Any) : this() {
        if(data as? Map<String, Any> != null) {
            val sentenceDic = data as Map<String, Any>
            this.sentenceId = ToolManager.shared.checkMapString(sentenceDic.get("sentenceId"))
            this.content = ToolManager.shared.checkMapString(sentenceDic.get("content"))
            this.writer = ToolManager.shared.checkMapString(sentenceDic.get("writer"))
            this.bgImgUrl = ToolManager.shared.checkMapString(sentenceDic.get("bgImgUrl"))
            this.likeCnt = ToolManager.shared.checkMapString(sentenceDic.get("likeCnt"))
            this.bgCurrentImg = ToolManager.shared.checkMapString(sentenceDic.get("bgCurrentImg"))
        }
    }
}
