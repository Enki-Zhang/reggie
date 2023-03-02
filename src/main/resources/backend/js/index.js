/* 自定义trim */
function trim(str) {  //删除左右两端的空格,自定义的trim()方法
    return str == undefined ? "" : str.replace(/(^\s*)|(\s*$)/g, "")
}

//获取url地址上面的参数
function requestUrlParam(argname) {
    var url = location.href
    //将字符串进行截取 从?后面截取 并从&进行分割 防止截取到id之外的参数
    var arrStr = url.substring(url.indexOf("?") + 1).split("&")
    for (var i = 0; i < arrStr.length; i++) {
        //遍历截取 argname= 之后的字符串
        var loc = arrStr[i].indexOf(argname + "=")
        if (loc != -1) {
            // 将 id=1554336625964630017 中标的 id= 替换为“”
            return arrStr[i].replace(argname + "=", "").replace("?", "")
        }
    }
    return ""
}
