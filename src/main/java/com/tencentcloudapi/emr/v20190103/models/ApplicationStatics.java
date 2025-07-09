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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationStatics extends AbstractModel {

    /**
    * Queue name
    */
    @SerializedName("Queue")
    @Expose
    private String Queue;

    /**
    * Username
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Application type
    */
    @SerializedName("ApplicationType")
    @Expose
    private String ApplicationType;

    /**
    * `SumMemorySeconds` meaning
    */
    @SerializedName("SumMemorySeconds")
    @Expose
    private Long SumMemorySeconds;

    /**
    * 
    */
    @SerializedName("SumVCoreSeconds")
    @Expose
    private Long SumVCoreSeconds;

    /**
    * SumHDFSBytesWritten (with unit)
    */
    @SerializedName("SumHDFSBytesWritten")
    @Expose
    private String SumHDFSBytesWritten;

    /**
    * SumHDFSBytesRead (with unit)
    */
    @SerializedName("SumHDFSBytesRead")
    @Expose
    private String SumHDFSBytesRead;

    /**
    * Application count
    */
    @SerializedName("CountApps")
    @Expose
    private Long CountApps;

    /**
     * Get Queue name 
     * @return Queue Queue name
     */
    public String getQueue() {
        return this.Queue;
    }

    /**
     * Set Queue name
     * @param Queue Queue name
     */
    public void setQueue(String Queue) {
        this.Queue = Queue;
    }

    /**
     * Get Username 
     * @return User Username
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set Username
     * @param User Username
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get Application type 
     * @return ApplicationType Application type
     */
    public String getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set Application type
     * @param ApplicationType Application type
     */
    public void setApplicationType(String ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * Get `SumMemorySeconds` meaning 
     * @return SumMemorySeconds `SumMemorySeconds` meaning
     */
    public Long getSumMemorySeconds() {
        return this.SumMemorySeconds;
    }

    /**
     * Set `SumMemorySeconds` meaning
     * @param SumMemorySeconds `SumMemorySeconds` meaning
     */
    public void setSumMemorySeconds(Long SumMemorySeconds) {
        this.SumMemorySeconds = SumMemorySeconds;
    }

    /**
     * Get  
     * @return SumVCoreSeconds 
     */
    public Long getSumVCoreSeconds() {
        return this.SumVCoreSeconds;
    }

    /**
     * Set 
     * @param SumVCoreSeconds 
     */
    public void setSumVCoreSeconds(Long SumVCoreSeconds) {
        this.SumVCoreSeconds = SumVCoreSeconds;
    }

    /**
     * Get SumHDFSBytesWritten (with unit) 
     * @return SumHDFSBytesWritten SumHDFSBytesWritten (with unit)
     */
    public String getSumHDFSBytesWritten() {
        return this.SumHDFSBytesWritten;
    }

    /**
     * Set SumHDFSBytesWritten (with unit)
     * @param SumHDFSBytesWritten SumHDFSBytesWritten (with unit)
     */
    public void setSumHDFSBytesWritten(String SumHDFSBytesWritten) {
        this.SumHDFSBytesWritten = SumHDFSBytesWritten;
    }

    /**
     * Get SumHDFSBytesRead (with unit) 
     * @return SumHDFSBytesRead SumHDFSBytesRead (with unit)
     */
    public String getSumHDFSBytesRead() {
        return this.SumHDFSBytesRead;
    }

    /**
     * Set SumHDFSBytesRead (with unit)
     * @param SumHDFSBytesRead SumHDFSBytesRead (with unit)
     */
    public void setSumHDFSBytesRead(String SumHDFSBytesRead) {
        this.SumHDFSBytesRead = SumHDFSBytesRead;
    }

    /**
     * Get Application count 
     * @return CountApps Application count
     */
    public Long getCountApps() {
        return this.CountApps;
    }

    /**
     * Set Application count
     * @param CountApps Application count
     */
    public void setCountApps(Long CountApps) {
        this.CountApps = CountApps;
    }

    public ApplicationStatics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplicationStatics(ApplicationStatics source) {
        if (source.Queue != null) {
            this.Queue = new String(source.Queue);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.ApplicationType != null) {
            this.ApplicationType = new String(source.ApplicationType);
        }
        if (source.SumMemorySeconds != null) {
            this.SumMemorySeconds = new Long(source.SumMemorySeconds);
        }
        if (source.SumVCoreSeconds != null) {
            this.SumVCoreSeconds = new Long(source.SumVCoreSeconds);
        }
        if (source.SumHDFSBytesWritten != null) {
            this.SumHDFSBytesWritten = new String(source.SumHDFSBytesWritten);
        }
        if (source.SumHDFSBytesRead != null) {
            this.SumHDFSBytesRead = new String(source.SumHDFSBytesRead);
        }
        if (source.CountApps != null) {
            this.CountApps = new Long(source.CountApps);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Queue", this.Queue);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);
        this.setParamSimple(map, prefix + "SumMemorySeconds", this.SumMemorySeconds);
        this.setParamSimple(map, prefix + "SumVCoreSeconds", this.SumVCoreSeconds);
        this.setParamSimple(map, prefix + "SumHDFSBytesWritten", this.SumHDFSBytesWritten);
        this.setParamSimple(map, prefix + "SumHDFSBytesRead", this.SumHDFSBytesRead);
        this.setParamSimple(map, prefix + "CountApps", this.CountApps);

    }
}

