/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyEventConfigRequest extends AbstractModel {

    /**
    * <p><b>On-demand <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services from December 25, 2023, this field must be filled in with the app ID when accessing resources in on-demand applications, whether it is the default application or a newly created application.</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>Method of receiving event notifications.</p><li>PUSH: [HTTP callback notification](https://www.tencentcloud.com/document/product/266/33779?from_cn_redirect=1);</li><li>PULL: [Reliable notification based on message queue](https://www.tencentcloud.com/document/product/266/33779?from_cn_redirect=1).</li>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>When using <a href="https://www.tencentcloud.com/document/product/266/33779?from_cn_redirect=1">HTTP callback notification</a> as the receiving channel, this is the address for receiving 3.0 format callbacks.<br>Note: If the NotificationUrl parameter is included and its value is an empty string, the 3.0 format callback address will be cleared.</p>
    */
    @SerializedName("NotificationUrl")
    @Expose
    private String NotificationUrl;

    /**
    * <p>Whether to receive <a href="https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1">video upload complete</a> event notifications. Default &quot;OFF&quot; ignores the event notification, and &quot;ON&quot; receives event notifications.</p>
    */
    @SerializedName("UploadMediaCompleteEventSwitch")
    @Expose
    private String UploadMediaCompleteEventSwitch;

    /**
    * <p>Whether to receive <a href="https://www.tencentcloud.com/document/product/266/13434?from_cn_redirect=1">video deletion completed</a> event notifications. Default &quot;OFF&quot; ignores the event notification, and &quot;ON&quot; receives event notifications.</p>
    */
    @SerializedName("DeleteMediaCompleteEventSwitch")
    @Expose
    private String DeleteMediaCompleteEventSwitch;

    /**
    * <p>Whether to receive event notifications for clip solidification completion. Default &quot;OFF&quot; ignores the event notification, and &quot;ON&quot; receives event notifications.</p>
    */
    @SerializedName("PersistenceCompleteEventSwitch")
    @Expose
    private String PersistenceCompleteEventSwitch;

    /**
    * <p>Callback key, consisting of upper- and lower-case letters and digits, up to 32 characters. After configuration, the <code>Sign</code> and <code>T</code> fields will be sent in callbacks for authentication.</p><ul><li><code>Sign</code>: string. Event notification security signature Sign = MD5 (SignKey + T). Description: Tencent Cloud concatenates the encrypted SignKey and T, calculates the Sign value through MD5, and places it in the notification message. Upon receiving the notification message, your backend server can verify whether Sign is correct based on the same algorithm, and furthermore confirm whether the message indeed comes from Tencent Cloud Backend.</li><li><code>T</code>: int64. Expiration time, the UNIX timestamp when the event notification signature expires. The default expiration time for notifications from Tencent Cloud is 10 minutes. If the time specified by the T value in a message notification has expired, deem this notification invalid, and furthermore prevent network replay attacks. T is in decimal UNIX timestamp format, that is, the seconds elapsed since January 1, 1970 (midnight UTC/GMT).</li></ul>
    */
    @SerializedName("SignKey")
    @Expose
    private String SignKey;

    /**
     * Get <p><b>On-demand <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services from December 25, 2023, this field must be filled in with the app ID when accessing resources in on-demand applications, whether it is the default application or a newly created application.</b></p> 
     * @return SubAppId <p><b>On-demand <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services from December 25, 2023, this field must be filled in with the app ID when accessing resources in on-demand applications, whether it is the default application or a newly created application.</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>On-demand <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services from December 25, 2023, this field must be filled in with the app ID when accessing resources in on-demand applications, whether it is the default application or a newly created application.</b></p>
     * @param SubAppId <p><b>On-demand <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services from December 25, 2023, this field must be filled in with the app ID when accessing resources in on-demand applications, whether it is the default application or a newly created application.</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>Method of receiving event notifications.</p><li>PUSH: [HTTP callback notification](https://www.tencentcloud.com/document/product/266/33779?from_cn_redirect=1);</li><li>PULL: [Reliable notification based on message queue](https://www.tencentcloud.com/document/product/266/33779?from_cn_redirect=1).</li> 
     * @return Mode <p>Method of receiving event notifications.</p><li>PUSH: [HTTP callback notification](https://www.tencentcloud.com/document/product/266/33779?from_cn_redirect=1);</li><li>PULL: [Reliable notification based on message queue](https://www.tencentcloud.com/document/product/266/33779?from_cn_redirect=1).</li>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>Method of receiving event notifications.</p><li>PUSH: [HTTP callback notification](https://www.tencentcloud.com/document/product/266/33779?from_cn_redirect=1);</li><li>PULL: [Reliable notification based on message queue](https://www.tencentcloud.com/document/product/266/33779?from_cn_redirect=1).</li>
     * @param Mode <p>Method of receiving event notifications.</p><li>PUSH: [HTTP callback notification](https://www.tencentcloud.com/document/product/266/33779?from_cn_redirect=1);</li><li>PULL: [Reliable notification based on message queue](https://www.tencentcloud.com/document/product/266/33779?from_cn_redirect=1).</li>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>When using <a href="https://www.tencentcloud.com/document/product/266/33779?from_cn_redirect=1">HTTP callback notification</a> as the receiving channel, this is the address for receiving 3.0 format callbacks.<br>Note: If the NotificationUrl parameter is included and its value is an empty string, the 3.0 format callback address will be cleared.</p> 
     * @return NotificationUrl <p>When using <a href="https://www.tencentcloud.com/document/product/266/33779?from_cn_redirect=1">HTTP callback notification</a> as the receiving channel, this is the address for receiving 3.0 format callbacks.<br>Note: If the NotificationUrl parameter is included and its value is an empty string, the 3.0 format callback address will be cleared.</p>
     */
    public String getNotificationUrl() {
        return this.NotificationUrl;
    }

    /**
     * Set <p>When using <a href="https://www.tencentcloud.com/document/product/266/33779?from_cn_redirect=1">HTTP callback notification</a> as the receiving channel, this is the address for receiving 3.0 format callbacks.<br>Note: If the NotificationUrl parameter is included and its value is an empty string, the 3.0 format callback address will be cleared.</p>
     * @param NotificationUrl <p>When using <a href="https://www.tencentcloud.com/document/product/266/33779?from_cn_redirect=1">HTTP callback notification</a> as the receiving channel, this is the address for receiving 3.0 format callbacks.<br>Note: If the NotificationUrl parameter is included and its value is an empty string, the 3.0 format callback address will be cleared.</p>
     */
    public void setNotificationUrl(String NotificationUrl) {
        this.NotificationUrl = NotificationUrl;
    }

    /**
     * Get <p>Whether to receive <a href="https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1">video upload complete</a> event notifications. Default &quot;OFF&quot; ignores the event notification, and &quot;ON&quot; receives event notifications.</p> 
     * @return UploadMediaCompleteEventSwitch <p>Whether to receive <a href="https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1">video upload complete</a> event notifications. Default &quot;OFF&quot; ignores the event notification, and &quot;ON&quot; receives event notifications.</p>
     */
    public String getUploadMediaCompleteEventSwitch() {
        return this.UploadMediaCompleteEventSwitch;
    }

    /**
     * Set <p>Whether to receive <a href="https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1">video upload complete</a> event notifications. Default &quot;OFF&quot; ignores the event notification, and &quot;ON&quot; receives event notifications.</p>
     * @param UploadMediaCompleteEventSwitch <p>Whether to receive <a href="https://www.tencentcloud.com/document/product/266/7830?from_cn_redirect=1">video upload complete</a> event notifications. Default &quot;OFF&quot; ignores the event notification, and &quot;ON&quot; receives event notifications.</p>
     */
    public void setUploadMediaCompleteEventSwitch(String UploadMediaCompleteEventSwitch) {
        this.UploadMediaCompleteEventSwitch = UploadMediaCompleteEventSwitch;
    }

    /**
     * Get <p>Whether to receive <a href="https://www.tencentcloud.com/document/product/266/13434?from_cn_redirect=1">video deletion completed</a> event notifications. Default &quot;OFF&quot; ignores the event notification, and &quot;ON&quot; receives event notifications.</p> 
     * @return DeleteMediaCompleteEventSwitch <p>Whether to receive <a href="https://www.tencentcloud.com/document/product/266/13434?from_cn_redirect=1">video deletion completed</a> event notifications. Default &quot;OFF&quot; ignores the event notification, and &quot;ON&quot; receives event notifications.</p>
     */
    public String getDeleteMediaCompleteEventSwitch() {
        return this.DeleteMediaCompleteEventSwitch;
    }

    /**
     * Set <p>Whether to receive <a href="https://www.tencentcloud.com/document/product/266/13434?from_cn_redirect=1">video deletion completed</a> event notifications. Default &quot;OFF&quot; ignores the event notification, and &quot;ON&quot; receives event notifications.</p>
     * @param DeleteMediaCompleteEventSwitch <p>Whether to receive <a href="https://www.tencentcloud.com/document/product/266/13434?from_cn_redirect=1">video deletion completed</a> event notifications. Default &quot;OFF&quot; ignores the event notification, and &quot;ON&quot; receives event notifications.</p>
     */
    public void setDeleteMediaCompleteEventSwitch(String DeleteMediaCompleteEventSwitch) {
        this.DeleteMediaCompleteEventSwitch = DeleteMediaCompleteEventSwitch;
    }

    /**
     * Get <p>Whether to receive event notifications for clip solidification completion. Default &quot;OFF&quot; ignores the event notification, and &quot;ON&quot; receives event notifications.</p> 
     * @return PersistenceCompleteEventSwitch <p>Whether to receive event notifications for clip solidification completion. Default &quot;OFF&quot; ignores the event notification, and &quot;ON&quot; receives event notifications.</p>
     */
    public String getPersistenceCompleteEventSwitch() {
        return this.PersistenceCompleteEventSwitch;
    }

    /**
     * Set <p>Whether to receive event notifications for clip solidification completion. Default &quot;OFF&quot; ignores the event notification, and &quot;ON&quot; receives event notifications.</p>
     * @param PersistenceCompleteEventSwitch <p>Whether to receive event notifications for clip solidification completion. Default &quot;OFF&quot; ignores the event notification, and &quot;ON&quot; receives event notifications.</p>
     */
    public void setPersistenceCompleteEventSwitch(String PersistenceCompleteEventSwitch) {
        this.PersistenceCompleteEventSwitch = PersistenceCompleteEventSwitch;
    }

    /**
     * Get <p>Callback key, consisting of upper- and lower-case letters and digits, up to 32 characters. After configuration, the <code>Sign</code> and <code>T</code> fields will be sent in callbacks for authentication.</p><ul><li><code>Sign</code>: string. Event notification security signature Sign = MD5 (SignKey + T). Description: Tencent Cloud concatenates the encrypted SignKey and T, calculates the Sign value through MD5, and places it in the notification message. Upon receiving the notification message, your backend server can verify whether Sign is correct based on the same algorithm, and furthermore confirm whether the message indeed comes from Tencent Cloud Backend.</li><li><code>T</code>: int64. Expiration time, the UNIX timestamp when the event notification signature expires. The default expiration time for notifications from Tencent Cloud is 10 minutes. If the time specified by the T value in a message notification has expired, deem this notification invalid, and furthermore prevent network replay attacks. T is in decimal UNIX timestamp format, that is, the seconds elapsed since January 1, 1970 (midnight UTC/GMT).</li></ul> 
     * @return SignKey <p>Callback key, consisting of upper- and lower-case letters and digits, up to 32 characters. After configuration, the <code>Sign</code> and <code>T</code> fields will be sent in callbacks for authentication.</p><ul><li><code>Sign</code>: string. Event notification security signature Sign = MD5 (SignKey + T). Description: Tencent Cloud concatenates the encrypted SignKey and T, calculates the Sign value through MD5, and places it in the notification message. Upon receiving the notification message, your backend server can verify whether Sign is correct based on the same algorithm, and furthermore confirm whether the message indeed comes from Tencent Cloud Backend.</li><li><code>T</code>: int64. Expiration time, the UNIX timestamp when the event notification signature expires. The default expiration time for notifications from Tencent Cloud is 10 minutes. If the time specified by the T value in a message notification has expired, deem this notification invalid, and furthermore prevent network replay attacks. T is in decimal UNIX timestamp format, that is, the seconds elapsed since January 1, 1970 (midnight UTC/GMT).</li></ul>
     */
    public String getSignKey() {
        return this.SignKey;
    }

    /**
     * Set <p>Callback key, consisting of upper- and lower-case letters and digits, up to 32 characters. After configuration, the <code>Sign</code> and <code>T</code> fields will be sent in callbacks for authentication.</p><ul><li><code>Sign</code>: string. Event notification security signature Sign = MD5 (SignKey + T). Description: Tencent Cloud concatenates the encrypted SignKey and T, calculates the Sign value through MD5, and places it in the notification message. Upon receiving the notification message, your backend server can verify whether Sign is correct based on the same algorithm, and furthermore confirm whether the message indeed comes from Tencent Cloud Backend.</li><li><code>T</code>: int64. Expiration time, the UNIX timestamp when the event notification signature expires. The default expiration time for notifications from Tencent Cloud is 10 minutes. If the time specified by the T value in a message notification has expired, deem this notification invalid, and furthermore prevent network replay attacks. T is in decimal UNIX timestamp format, that is, the seconds elapsed since January 1, 1970 (midnight UTC/GMT).</li></ul>
     * @param SignKey <p>Callback key, consisting of upper- and lower-case letters and digits, up to 32 characters. After configuration, the <code>Sign</code> and <code>T</code> fields will be sent in callbacks for authentication.</p><ul><li><code>Sign</code>: string. Event notification security signature Sign = MD5 (SignKey + T). Description: Tencent Cloud concatenates the encrypted SignKey and T, calculates the Sign value through MD5, and places it in the notification message. Upon receiving the notification message, your backend server can verify whether Sign is correct based on the same algorithm, and furthermore confirm whether the message indeed comes from Tencent Cloud Backend.</li><li><code>T</code>: int64. Expiration time, the UNIX timestamp when the event notification signature expires. The default expiration time for notifications from Tencent Cloud is 10 minutes. If the time specified by the T value in a message notification has expired, deem this notification invalid, and furthermore prevent network replay attacks. T is in decimal UNIX timestamp format, that is, the seconds elapsed since January 1, 1970 (midnight UTC/GMT).</li></ul>
     */
    public void setSignKey(String SignKey) {
        this.SignKey = SignKey;
    }

    public ModifyEventConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEventConfigRequest(ModifyEventConfigRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.NotificationUrl != null) {
            this.NotificationUrl = new String(source.NotificationUrl);
        }
        if (source.UploadMediaCompleteEventSwitch != null) {
            this.UploadMediaCompleteEventSwitch = new String(source.UploadMediaCompleteEventSwitch);
        }
        if (source.DeleteMediaCompleteEventSwitch != null) {
            this.DeleteMediaCompleteEventSwitch = new String(source.DeleteMediaCompleteEventSwitch);
        }
        if (source.PersistenceCompleteEventSwitch != null) {
            this.PersistenceCompleteEventSwitch = new String(source.PersistenceCompleteEventSwitch);
        }
        if (source.SignKey != null) {
            this.SignKey = new String(source.SignKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "NotificationUrl", this.NotificationUrl);
        this.setParamSimple(map, prefix + "UploadMediaCompleteEventSwitch", this.UploadMediaCompleteEventSwitch);
        this.setParamSimple(map, prefix + "DeleteMediaCompleteEventSwitch", this.DeleteMediaCompleteEventSwitch);
        this.setParamSimple(map, prefix + "PersistenceCompleteEventSwitch", this.PersistenceCompleteEventSwitch);
        this.setParamSimple(map, prefix + "SignKey", this.SignKey);

    }
}

