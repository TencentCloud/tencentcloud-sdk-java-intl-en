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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessKeyAlarmCount extends AbstractModel {

    /**
    * Access key ID.
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * Access key.
    */
    @SerializedName("AccessKey")
    @Expose
    private String AccessKey;

    /**
    * Alarm count.
    */
    @SerializedName("AlarmCount")
    @Expose
    private Long AlarmCount;

    /**
    * Security credentials status. valid values: 0 (disabled), 1 (enabled), 2 (deleted).
    */
    @SerializedName("AccessKeyStatus")
    @Expose
    private Long AccessKeyStatus;

    /**
    * AK creation time.
    */
    @SerializedName("AccessKeyCreateTime")
    @Expose
    private String AccessKeyCreateTime;

    /**
    * AK last usage time. returns "-" if never used.
    */
    @SerializedName("LastAccessTime")
    @Expose
    private String LastAccessTime;

    /**
     * Get Access key ID. 
     * @return ID Access key ID.
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set Access key ID.
     * @param ID Access key ID.
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get Access key. 
     * @return AccessKey Access key.
     */
    public String getAccessKey() {
        return this.AccessKey;
    }

    /**
     * Set Access key.
     * @param AccessKey Access key.
     */
    public void setAccessKey(String AccessKey) {
        this.AccessKey = AccessKey;
    }

    /**
     * Get Alarm count. 
     * @return AlarmCount Alarm count.
     */
    public Long getAlarmCount() {
        return this.AlarmCount;
    }

    /**
     * Set Alarm count.
     * @param AlarmCount Alarm count.
     */
    public void setAlarmCount(Long AlarmCount) {
        this.AlarmCount = AlarmCount;
    }

    /**
     * Get Security credentials status. valid values: 0 (disabled), 1 (enabled), 2 (deleted). 
     * @return AccessKeyStatus Security credentials status. valid values: 0 (disabled), 1 (enabled), 2 (deleted).
     */
    public Long getAccessKeyStatus() {
        return this.AccessKeyStatus;
    }

    /**
     * Set Security credentials status. valid values: 0 (disabled), 1 (enabled), 2 (deleted).
     * @param AccessKeyStatus Security credentials status. valid values: 0 (disabled), 1 (enabled), 2 (deleted).
     */
    public void setAccessKeyStatus(Long AccessKeyStatus) {
        this.AccessKeyStatus = AccessKeyStatus;
    }

    /**
     * Get AK creation time. 
     * @return AccessKeyCreateTime AK creation time.
     */
    public String getAccessKeyCreateTime() {
        return this.AccessKeyCreateTime;
    }

    /**
     * Set AK creation time.
     * @param AccessKeyCreateTime AK creation time.
     */
    public void setAccessKeyCreateTime(String AccessKeyCreateTime) {
        this.AccessKeyCreateTime = AccessKeyCreateTime;
    }

    /**
     * Get AK last usage time. returns "-" if never used. 
     * @return LastAccessTime AK last usage time. returns "-" if never used.
     */
    public String getLastAccessTime() {
        return this.LastAccessTime;
    }

    /**
     * Set AK last usage time. returns "-" if never used.
     * @param LastAccessTime AK last usage time. returns "-" if never used.
     */
    public void setLastAccessTime(String LastAccessTime) {
        this.LastAccessTime = LastAccessTime;
    }

    public AccessKeyAlarmCount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessKeyAlarmCount(AccessKeyAlarmCount source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.AccessKey != null) {
            this.AccessKey = new String(source.AccessKey);
        }
        if (source.AlarmCount != null) {
            this.AlarmCount = new Long(source.AlarmCount);
        }
        if (source.AccessKeyStatus != null) {
            this.AccessKeyStatus = new Long(source.AccessKeyStatus);
        }
        if (source.AccessKeyCreateTime != null) {
            this.AccessKeyCreateTime = new String(source.AccessKeyCreateTime);
        }
        if (source.LastAccessTime != null) {
            this.LastAccessTime = new String(source.LastAccessTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "AccessKey", this.AccessKey);
        this.setParamSimple(map, prefix + "AlarmCount", this.AlarmCount);
        this.setParamSimple(map, prefix + "AccessKeyStatus", this.AccessKeyStatus);
        this.setParamSimple(map, prefix + "AccessKeyCreateTime", this.AccessKeyCreateTime);
        this.setParamSimple(map, prefix + "LastAccessTime", this.LastAccessTime);

    }
}

