;!function () {
    var layer = layui.layer,
        form = layui.form;
}();

/**
 * 向指定 url 发送 get 请求
 * @param href
 */
function c_location(href) {
    window.location = href;
}


/**
 * Layer 确认框
 * 点击 “确认” 后执行回调函数，点击 “取消” 不做任何操作
 *
 * @param msg 确认消息
 * @param callback 回调函数
 */
function c_confirm(msg, callback) {
    layer.confirm(msg, {icon: 3, title: '提示'}, function (index) {
        callback();
        layer.close(index);
    });
}

/**
 * 弹出提示消息遮罩层
 *
 * @param msg 消息内容
 */
function msg(msg) {
    layer.msg(msg);
}

/**
 * 时间戳转日期字符串
 */
function formatDateTime(val, row, index) {
    var date = new Date(val);
    var y = date.getFullYear();
    var m = date.getMonth() + 1;
    m = m < 10 ? ('0' + m) : m;
    var d = date.getDate();
    d = d < 10 ? ('0' + d) : d;
    var h = date.getHours();
    h = h < 10 ? ('0' + h) : h;
    var minute = date.getMinutes();
    var second = date.getSeconds();
    minute = minute < 10 ? ('0' + minute) : minute;
    second = second < 10 ? ('0' + second) : second;
    return y + '-' + m + '-' + d + ' ' + h + ':' + minute + ':' + second;
}

/**
 * 截取指定长度的字符串
 * 在末尾添加 “...”
 */
function formatStrLength(val, row, index) {
    val.substring(0, 20);
    val += "...";
    return val;
}