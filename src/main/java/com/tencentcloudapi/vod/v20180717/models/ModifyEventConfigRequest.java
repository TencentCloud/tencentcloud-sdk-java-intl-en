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
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 
    */
    @SerializedName("NotificationUrl")
    @Expose
    private String NotificationUrl;

    /**
    * 
    */
    @SerializedName("UploadMediaCompleteEventSwitch")
    @Expose
    private String UploadMediaCompleteEventSwitch;

    /**
    * 
    */
    @SerializedName("DeleteMediaCompleteEventSwitch")
    @Expose
    private String DeleteMediaCompleteEventSwitch;

    /**
    * 
    */
    @SerializedName("PersistenceCompleteEventSwitch")
    @Expose
    private String PersistenceCompleteEventSwitch;

    /**
    * 
    */
    @SerializedName("SignKey")
    @Expose
    private String SignKey;

    /**
     * Get  
     * @return SubAppId 
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 
     * @param SubAppId 
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get  
     * @return Mode 
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 
     * @param Mode 
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get  
     * @return NotificationUrl 
     */
    public String getNotificationUrl() {
        return this.NotificationUrl;
    }

    /**
     * Set 
     * @param NotificationUrl 
     */
    public void setNotificationUrl(String NotificationUrl) {
        this.NotificationUrl = NotificationUrl;
    }

    /**
     * Get  
     * @return UploadMediaCompleteEventSwitch 
     */
    public String getUploadMediaCompleteEventSwitch() {
        return this.UploadMediaCompleteEventSwitch;
    }

    /**
     * Set 
     * @param UploadMediaCompleteEventSwitch 
     */
    public void setUploadMediaCompleteEventSwitch(String UploadMediaCompleteEventSwitch) {
        this.UploadMediaCompleteEventSwitch = UploadMediaCompleteEventSwitch;
    }

    /**
     * Get  
     * @return DeleteMediaCompleteEventSwitch 
     */
    public String getDeleteMediaCompleteEventSwitch() {
        return this.DeleteMediaCompleteEventSwitch;
    }

    /**
     * Set 
     * @param DeleteMediaCompleteEventSwitch 
     */
    public void setDeleteMediaCompleteEventSwitch(String DeleteMediaCompleteEventSwitch) {
        this.DeleteMediaCompleteEventSwitch = DeleteMediaCompleteEventSwitch;
    }

    /**
     * Get  
     * @return PersistenceCompleteEventSwitch 
     */
    public String getPersistenceCompleteEventSwitch() {
        return this.PersistenceCompleteEventSwitch;
    }

    /**
     * Set 
     * @param PersistenceCompleteEventSwitch 
     */
    public void setPersistenceCompleteEventSwitch(String PersistenceCompleteEventSwitch) {
        this.PersistenceCompleteEventSwitch = PersistenceCompleteEventSwitch;
    }

    /**
     * Get  
     * @return SignKey 
     */
    public String getSignKey() {
        return this.SignKey;
    }

    /**
     * Set 
     * @param SignKey 
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

