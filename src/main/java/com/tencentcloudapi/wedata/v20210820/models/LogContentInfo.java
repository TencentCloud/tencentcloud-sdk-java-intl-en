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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogContentInfo extends AbstractModel {

    /**
    * Log contentNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Log")
    @Expose
    private String Log;

    /**
    * Log group Id\nNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("PkgId")
    @Expose
    private String PkgId;

    /**
    * Log ID
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("PkgLogId")
    @Expose
    private String PkgLogId;

    /**
    * TimeNote: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * Container Name the Log Belongs To
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
     * Get Log contentNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Log Log contentNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getLog() {
        return this.Log;
    }

    /**
     * Set Log contentNote: This field may return null, indicating that no valid value can be obtained.
     * @param Log Log contentNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setLog(String Log) {
        this.Log = Log;
    }

    /**
     * Get Log group Id\nNote: This field may return null, indicating that no valid value can be obtained. 
     * @return PkgId Log group Id\nNote: This field may return null, indicating that no valid value can be obtained.
     */
    public String getPkgId() {
        return this.PkgId;
    }

    /**
     * Set Log group Id\nNote: This field may return null, indicating that no valid value can be obtained.
     * @param PkgId Log group Id\nNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setPkgId(String PkgId) {
        this.PkgId = PkgId;
    }

    /**
     * Get Log ID
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return PkgLogId Log ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getPkgLogId() {
        return this.PkgLogId;
    }

    /**
     * Set Log ID
Note: This field may return null, indicating that no valid value can be obtained.
     * @param PkgLogId Log ID
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setPkgLogId(String PkgLogId) {
        this.PkgLogId = PkgLogId;
    }

    /**
     * Get TimeNote: This field may return null, indicating that no valid value can be obtained. 
     * @return Time TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set TimeNote: This field may return null, indicating that no valid value can be obtained.
     * @param Time TimeNote: This field may return null, indicating that no valid value can be obtained.
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get Container Name the Log Belongs To
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return ContainerName Container Name the Log Belongs To
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set Container Name the Log Belongs To
Note: This field may return null, indicating that no valid value can be obtained.
     * @param ContainerName Container Name the Log Belongs To
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    public LogContentInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogContentInfo(LogContentInfo source) {
        if (source.Log != null) {
            this.Log = new String(source.Log);
        }
        if (source.PkgId != null) {
            this.PkgId = new String(source.PkgId);
        }
        if (source.PkgLogId != null) {
            this.PkgLogId = new String(source.PkgLogId);
        }
        if (source.Time != null) {
            this.Time = new Long(source.Time);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Log", this.Log);
        this.setParamSimple(map, prefix + "PkgId", this.PkgId);
        this.setParamSimple(map, prefix + "PkgLogId", this.PkgLogId);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);

    }
}

