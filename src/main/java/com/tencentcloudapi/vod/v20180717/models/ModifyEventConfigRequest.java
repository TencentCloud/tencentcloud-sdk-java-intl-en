/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
    * How to receive event notifications. 
<li>PUSH: [HTTP callback notification](https://www.tencentcloud.com/document/product/266/33948);</li>
<li>PULL: [Reliable notification based on message queue ](https://www.tencentcloud.com/document/product/266/33948). </li>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * The address used to receive 3.0 format callbacks when using the [HTTP callback notification](https://www.tencentcloud.com/document/product/266/33948) reception method. 
Note: If the NotificationUrl parameter is provided and the value is an empty string, the 3.0 format callback address will be cleared.
    */
    @SerializedName("NotificationUrl")
    @Expose
    private String NotificationUrl;

    /**
    * Whether to receive the [Video Upload Completed](https://www.tencentcloud.com/document/product/266/33950) event notification. The default "OFF" is to ignore the event notification, and "ON" is to receive the event notification. 
    */
    @SerializedName("UploadMediaCompleteEventSwitch")
    @Expose
    private String UploadMediaCompleteEventSwitch;

    /**
    * Whether to receive [Video deletion completed](https://www.tencentcloud.com/document/product/266/33952) event notification, the default "OFF" means to ignore the event notification, "ON" means to receive the event notification .
    */
    @SerializedName("DeleteMediaCompleteEventSwitch")
    @Expose
    private String DeleteMediaCompleteEventSwitch;

    /**
    * <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get How to receive event notifications. 
<li>PUSH: [HTTP callback notification](https://www.tencentcloud.com/document/product/266/33948);</li>
<li>PULL: [Reliable notification based on message queue ](https://www.tencentcloud.com/document/product/266/33948). </li> 
     * @return Mode How to receive event notifications. 
<li>PUSH: [HTTP callback notification](https://www.tencentcloud.com/document/product/266/33948);</li>
<li>PULL: [Reliable notification based on message queue ](https://www.tencentcloud.com/document/product/266/33948). </li>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set How to receive event notifications. 
<li>PUSH: [HTTP callback notification](https://www.tencentcloud.com/document/product/266/33948);</li>
<li>PULL: [Reliable notification based on message queue ](https://www.tencentcloud.com/document/product/266/33948). </li>
     * @param Mode How to receive event notifications. 
<li>PUSH: [HTTP callback notification](https://www.tencentcloud.com/document/product/266/33948);</li>
<li>PULL: [Reliable notification based on message queue ](https://www.tencentcloud.com/document/product/266/33948). </li>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get The address used to receive 3.0 format callbacks when using the [HTTP callback notification](https://www.tencentcloud.com/document/product/266/33948) reception method. 
Note: If the NotificationUrl parameter is provided and the value is an empty string, the 3.0 format callback address will be cleared. 
     * @return NotificationUrl The address used to receive 3.0 format callbacks when using the [HTTP callback notification](https://www.tencentcloud.com/document/product/266/33948) reception method. 
Note: If the NotificationUrl parameter is provided and the value is an empty string, the 3.0 format callback address will be cleared.
     */
    public String getNotificationUrl() {
        return this.NotificationUrl;
    }

    /**
     * Set The address used to receive 3.0 format callbacks when using the [HTTP callback notification](https://www.tencentcloud.com/document/product/266/33948) reception method. 
Note: If the NotificationUrl parameter is provided and the value is an empty string, the 3.0 format callback address will be cleared.
     * @param NotificationUrl The address used to receive 3.0 format callbacks when using the [HTTP callback notification](https://www.tencentcloud.com/document/product/266/33948) reception method. 
Note: If the NotificationUrl parameter is provided and the value is an empty string, the 3.0 format callback address will be cleared.
     */
    public void setNotificationUrl(String NotificationUrl) {
        this.NotificationUrl = NotificationUrl;
    }

    /**
     * Get Whether to receive the [Video Upload Completed](https://www.tencentcloud.com/document/product/266/33950) event notification. The default "OFF" is to ignore the event notification, and "ON" is to receive the event notification.  
     * @return UploadMediaCompleteEventSwitch Whether to receive the [Video Upload Completed](https://www.tencentcloud.com/document/product/266/33950) event notification. The default "OFF" is to ignore the event notification, and "ON" is to receive the event notification. 
     */
    public String getUploadMediaCompleteEventSwitch() {
        return this.UploadMediaCompleteEventSwitch;
    }

    /**
     * Set Whether to receive the [Video Upload Completed](https://www.tencentcloud.com/document/product/266/33950) event notification. The default "OFF" is to ignore the event notification, and "ON" is to receive the event notification. 
     * @param UploadMediaCompleteEventSwitch Whether to receive the [Video Upload Completed](https://www.tencentcloud.com/document/product/266/33950) event notification. The default "OFF" is to ignore the event notification, and "ON" is to receive the event notification. 
     */
    public void setUploadMediaCompleteEventSwitch(String UploadMediaCompleteEventSwitch) {
        this.UploadMediaCompleteEventSwitch = UploadMediaCompleteEventSwitch;
    }

    /**
     * Get Whether to receive [Video deletion completed](https://www.tencentcloud.com/document/product/266/33952) event notification, the default "OFF" means to ignore the event notification, "ON" means to receive the event notification . 
     * @return DeleteMediaCompleteEventSwitch Whether to receive [Video deletion completed](https://www.tencentcloud.com/document/product/266/33952) event notification, the default "OFF" means to ignore the event notification, "ON" means to receive the event notification .
     */
    public String getDeleteMediaCompleteEventSwitch() {
        return this.DeleteMediaCompleteEventSwitch;
    }

    /**
     * Set Whether to receive [Video deletion completed](https://www.tencentcloud.com/document/product/266/33952) event notification, the default "OFF" means to ignore the event notification, "ON" means to receive the event notification .
     * @param DeleteMediaCompleteEventSwitch Whether to receive [Video deletion completed](https://www.tencentcloud.com/document/product/266/33952) event notification, the default "OFF" means to ignore the event notification, "ON" means to receive the event notification .
     */
    public void setDeleteMediaCompleteEventSwitch(String DeleteMediaCompleteEventSwitch) {
        this.DeleteMediaCompleteEventSwitch = DeleteMediaCompleteEventSwitch;
    }

    /**
     * Get <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b> 
     * @return SubAppId <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     * @param SubAppId <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    public ModifyEventConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEventConfigRequest(ModifyEventConfigRequest source) {
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
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "NotificationUrl", this.NotificationUrl);
        this.setParamSimple(map, prefix + "UploadMediaCompleteEventSwitch", this.UploadMediaCompleteEventSwitch);
        this.setParamSimple(map, prefix + "DeleteMediaCompleteEventSwitch", this.DeleteMediaCompleteEventSwitch);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

