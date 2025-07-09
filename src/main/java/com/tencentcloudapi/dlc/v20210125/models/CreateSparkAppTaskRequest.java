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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSparkAppTaskRequest extends AbstractModel {

    /**
    * Spark job name
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * The input parameters of the Spark job, separated by space. They are generally used for periodic calls.
    */
    @SerializedName("CmdArgs")
    @Expose
    private String CmdArgs;

    /**
     * Get Spark job name 
     * @return JobName Spark job name
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set Spark job name
     * @param JobName Spark job name
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get The input parameters of the Spark job, separated by space. They are generally used for periodic calls. 
     * @return CmdArgs The input parameters of the Spark job, separated by space. They are generally used for periodic calls.
     */
    public String getCmdArgs() {
        return this.CmdArgs;
    }

    /**
     * Set The input parameters of the Spark job, separated by space. They are generally used for periodic calls.
     * @param CmdArgs The input parameters of the Spark job, separated by space. They are generally used for periodic calls.
     */
    public void setCmdArgs(String CmdArgs) {
        this.CmdArgs = CmdArgs;
    }

    public CreateSparkAppTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSparkAppTaskRequest(CreateSparkAppTaskRequest source) {
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.CmdArgs != null) {
            this.CmdArgs = new String(source.CmdArgs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "CmdArgs", this.CmdArgs);

    }
}

