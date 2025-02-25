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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApmAgentRequest extends AbstractModel {

    /**
    * Business system id.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Access method: currently supports access and reporting via skywalking, ot, and ebpf methods. if not specified, ot is used by default.
    */
    @SerializedName("AgentType")
    @Expose
    private String AgentType;

    /**
    * Reporting environment: currently supports pl (private network reporting), public (public network), and inner (self-developed vpc) environment reporting. if not specified, the default is public.
    */
    @SerializedName("NetworkMode")
    @Expose
    private String NetworkMode;

    /**
    * Language reporting is now supported for java, golang, php, python, dotnet, nodejs. if not specified, golang is used by default.
    */
    @SerializedName("LanguageEnvironment")
    @Expose
    private String LanguageEnvironment;

    /**
    * Reporting method, deprecated.
    */
    @SerializedName("ReportMethod")
    @Expose
    private String ReportMethod;

    /**
     * Get Business system id. 
     * @return InstanceId Business system id.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Business system id.
     * @param InstanceId Business system id.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Access method: currently supports access and reporting via skywalking, ot, and ebpf methods. if not specified, ot is used by default. 
     * @return AgentType Access method: currently supports access and reporting via skywalking, ot, and ebpf methods. if not specified, ot is used by default.
     */
    public String getAgentType() {
        return this.AgentType;
    }

    /**
     * Set Access method: currently supports access and reporting via skywalking, ot, and ebpf methods. if not specified, ot is used by default.
     * @param AgentType Access method: currently supports access and reporting via skywalking, ot, and ebpf methods. if not specified, ot is used by default.
     */
    public void setAgentType(String AgentType) {
        this.AgentType = AgentType;
    }

    /**
     * Get Reporting environment: currently supports pl (private network reporting), public (public network), and inner (self-developed vpc) environment reporting. if not specified, the default is public. 
     * @return NetworkMode Reporting environment: currently supports pl (private network reporting), public (public network), and inner (self-developed vpc) environment reporting. if not specified, the default is public.
     */
    public String getNetworkMode() {
        return this.NetworkMode;
    }

    /**
     * Set Reporting environment: currently supports pl (private network reporting), public (public network), and inner (self-developed vpc) environment reporting. if not specified, the default is public.
     * @param NetworkMode Reporting environment: currently supports pl (private network reporting), public (public network), and inner (self-developed vpc) environment reporting. if not specified, the default is public.
     */
    public void setNetworkMode(String NetworkMode) {
        this.NetworkMode = NetworkMode;
    }

    /**
     * Get Language reporting is now supported for java, golang, php, python, dotnet, nodejs. if not specified, golang is used by default. 
     * @return LanguageEnvironment Language reporting is now supported for java, golang, php, python, dotnet, nodejs. if not specified, golang is used by default.
     */
    public String getLanguageEnvironment() {
        return this.LanguageEnvironment;
    }

    /**
     * Set Language reporting is now supported for java, golang, php, python, dotnet, nodejs. if not specified, golang is used by default.
     * @param LanguageEnvironment Language reporting is now supported for java, golang, php, python, dotnet, nodejs. if not specified, golang is used by default.
     */
    public void setLanguageEnvironment(String LanguageEnvironment) {
        this.LanguageEnvironment = LanguageEnvironment;
    }

    /**
     * Get Reporting method, deprecated. 
     * @return ReportMethod Reporting method, deprecated.
     */
    public String getReportMethod() {
        return this.ReportMethod;
    }

    /**
     * Set Reporting method, deprecated.
     * @param ReportMethod Reporting method, deprecated.
     */
    public void setReportMethod(String ReportMethod) {
        this.ReportMethod = ReportMethod;
    }

    public DescribeApmAgentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApmAgentRequest(DescribeApmAgentRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AgentType != null) {
            this.AgentType = new String(source.AgentType);
        }
        if (source.NetworkMode != null) {
            this.NetworkMode = new String(source.NetworkMode);
        }
        if (source.LanguageEnvironment != null) {
            this.LanguageEnvironment = new String(source.LanguageEnvironment);
        }
        if (source.ReportMethod != null) {
            this.ReportMethod = new String(source.ReportMethod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AgentType", this.AgentType);
        this.setParamSimple(map, prefix + "NetworkMode", this.NetworkMode);
        this.setParamSimple(map, prefix + "LanguageEnvironment", this.LanguageEnvironment);
        this.setParamSimple(map, prefix + "ReportMethod", this.ReportMethod);

    }
}

