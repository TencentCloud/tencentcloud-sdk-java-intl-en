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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyMigrateRateLimitRequest extends AbstractModel {

    /**
    * Migration task ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Number of full export threads for migration task. Value range: 1-16.
    */
    @SerializedName("DumpThread")
    @Expose
    private Long DumpThread;

    /**
    * The full export Rps for migration task. The value needs to be greater than 0.
    */
    @SerializedName("DumpRps")
    @Expose
    private Long DumpRps;

    /**
    * Number of full import threads for migration task. Value range: 1-16.
    */
    @SerializedName("LoadThread")
    @Expose
    private Long LoadThread;

    /**
    * Number of incremental import threads for migration task. Value range: 1-128.
    */
    @SerializedName("SinkerThread")
    @Expose
    private Long SinkerThread;

    /**
    * Limits for full import Rps.
    */
    @SerializedName("LoadRps")
    @Expose
    private Long LoadRps;

    /**
     * Get Migration task ID 
     * @return JobId Migration task ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Migration task ID
     * @param JobId Migration task ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Number of full export threads for migration task. Value range: 1-16. 
     * @return DumpThread Number of full export threads for migration task. Value range: 1-16.
     */
    public Long getDumpThread() {
        return this.DumpThread;
    }

    /**
     * Set Number of full export threads for migration task. Value range: 1-16.
     * @param DumpThread Number of full export threads for migration task. Value range: 1-16.
     */
    public void setDumpThread(Long DumpThread) {
        this.DumpThread = DumpThread;
    }

    /**
     * Get The full export Rps for migration task. The value needs to be greater than 0. 
     * @return DumpRps The full export Rps for migration task. The value needs to be greater than 0.
     */
    public Long getDumpRps() {
        return this.DumpRps;
    }

    /**
     * Set The full export Rps for migration task. The value needs to be greater than 0.
     * @param DumpRps The full export Rps for migration task. The value needs to be greater than 0.
     */
    public void setDumpRps(Long DumpRps) {
        this.DumpRps = DumpRps;
    }

    /**
     * Get Number of full import threads for migration task. Value range: 1-16. 
     * @return LoadThread Number of full import threads for migration task. Value range: 1-16.
     */
    public Long getLoadThread() {
        return this.LoadThread;
    }

    /**
     * Set Number of full import threads for migration task. Value range: 1-16.
     * @param LoadThread Number of full import threads for migration task. Value range: 1-16.
     */
    public void setLoadThread(Long LoadThread) {
        this.LoadThread = LoadThread;
    }

    /**
     * Get Number of incremental import threads for migration task. Value range: 1-128. 
     * @return SinkerThread Number of incremental import threads for migration task. Value range: 1-128.
     */
    public Long getSinkerThread() {
        return this.SinkerThread;
    }

    /**
     * Set Number of incremental import threads for migration task. Value range: 1-128.
     * @param SinkerThread Number of incremental import threads for migration task. Value range: 1-128.
     */
    public void setSinkerThread(Long SinkerThread) {
        this.SinkerThread = SinkerThread;
    }

    /**
     * Get Limits for full import Rps. 
     * @return LoadRps Limits for full import Rps.
     */
    public Long getLoadRps() {
        return this.LoadRps;
    }

    /**
     * Set Limits for full import Rps.
     * @param LoadRps Limits for full import Rps.
     */
    public void setLoadRps(Long LoadRps) {
        this.LoadRps = LoadRps;
    }

    public ModifyMigrateRateLimitRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMigrateRateLimitRequest(ModifyMigrateRateLimitRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.DumpThread != null) {
            this.DumpThread = new Long(source.DumpThread);
        }
        if (source.DumpRps != null) {
            this.DumpRps = new Long(source.DumpRps);
        }
        if (source.LoadThread != null) {
            this.LoadThread = new Long(source.LoadThread);
        }
        if (source.SinkerThread != null) {
            this.SinkerThread = new Long(source.SinkerThread);
        }
        if (source.LoadRps != null) {
            this.LoadRps = new Long(source.LoadRps);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "DumpThread", this.DumpThread);
        this.setParamSimple(map, prefix + "DumpRps", this.DumpRps);
        this.setParamSimple(map, prefix + "LoadThread", this.LoadThread);
        this.setParamSimple(map, prefix + "SinkerThread", this.SinkerThread);
        this.setParamSimple(map, prefix + "LoadRps", this.LoadRps);

    }
}

