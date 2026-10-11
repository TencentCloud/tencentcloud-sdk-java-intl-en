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

public class ScriptBootstrapActionConfig extends AbstractModel {

    /**
    * COS address of the script. Format: https://beijing-111111.cos.ap-beijing.myqcloud.com/data/test.sh. To query the COS bucket list, refer to [Bucket List](https://console.cloud.tencent.com/cos/bucket).
    */
    @SerializedName("CosFileURI")
    @Expose
    private String CosFileURI;

    /**
    * Time range for the bootstrap script execution.
<li>resourceAfter: after node initialization</li>
<li>clusterAfter: after cluster startup</li>
<li>clusterBefore: before cluster startup</li>
    */
    @SerializedName("ExecutionMoment")
    @Expose
    private String ExecutionMoment;

    /**
    * Execution script parameters. For the parameter format, follow standard Shell specifications.
    */
    @SerializedName("Args")
    @Expose
    private String [] Args;

    /**
    * Script file name.
    */
    @SerializedName("CosFileName")
    @Expose
    private String CosFileName;

    /**
    * Remarks.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get COS address of the script. Format: https://beijing-111111.cos.ap-beijing.myqcloud.com/data/test.sh. To query the COS bucket list, refer to [Bucket List](https://console.cloud.tencent.com/cos/bucket). 
     * @return CosFileURI COS address of the script. Format: https://beijing-111111.cos.ap-beijing.myqcloud.com/data/test.sh. To query the COS bucket list, refer to [Bucket List](https://console.cloud.tencent.com/cos/bucket).
     */
    public String getCosFileURI() {
        return this.CosFileURI;
    }

    /**
     * Set COS address of the script. Format: https://beijing-111111.cos.ap-beijing.myqcloud.com/data/test.sh. To query the COS bucket list, refer to [Bucket List](https://console.cloud.tencent.com/cos/bucket).
     * @param CosFileURI COS address of the script. Format: https://beijing-111111.cos.ap-beijing.myqcloud.com/data/test.sh. To query the COS bucket list, refer to [Bucket List](https://console.cloud.tencent.com/cos/bucket).
     */
    public void setCosFileURI(String CosFileURI) {
        this.CosFileURI = CosFileURI;
    }

    /**
     * Get Time range for the bootstrap script execution.
<li>resourceAfter: after node initialization</li>
<li>clusterAfter: after cluster startup</li>
<li>clusterBefore: before cluster startup</li> 
     * @return ExecutionMoment Time range for the bootstrap script execution.
<li>resourceAfter: after node initialization</li>
<li>clusterAfter: after cluster startup</li>
<li>clusterBefore: before cluster startup</li>
     */
    public String getExecutionMoment() {
        return this.ExecutionMoment;
    }

    /**
     * Set Time range for the bootstrap script execution.
<li>resourceAfter: after node initialization</li>
<li>clusterAfter: after cluster startup</li>
<li>clusterBefore: before cluster startup</li>
     * @param ExecutionMoment Time range for the bootstrap script execution.
<li>resourceAfter: after node initialization</li>
<li>clusterAfter: after cluster startup</li>
<li>clusterBefore: before cluster startup</li>
     */
    public void setExecutionMoment(String ExecutionMoment) {
        this.ExecutionMoment = ExecutionMoment;
    }

    /**
     * Get Execution script parameters. For the parameter format, follow standard Shell specifications. 
     * @return Args Execution script parameters. For the parameter format, follow standard Shell specifications.
     */
    public String [] getArgs() {
        return this.Args;
    }

    /**
     * Set Execution script parameters. For the parameter format, follow standard Shell specifications.
     * @param Args Execution script parameters. For the parameter format, follow standard Shell specifications.
     */
    public void setArgs(String [] Args) {
        this.Args = Args;
    }

    /**
     * Get Script file name. 
     * @return CosFileName Script file name.
     */
    public String getCosFileName() {
        return this.CosFileName;
    }

    /**
     * Set Script file name.
     * @param CosFileName Script file name.
     */
    public void setCosFileName(String CosFileName) {
        this.CosFileName = CosFileName;
    }

    /**
     * Get Remarks. 
     * @return Remark Remarks.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks.
     * @param Remark Remarks.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public ScriptBootstrapActionConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScriptBootstrapActionConfig(ScriptBootstrapActionConfig source) {
        if (source.CosFileURI != null) {
            this.CosFileURI = new String(source.CosFileURI);
        }
        if (source.ExecutionMoment != null) {
            this.ExecutionMoment = new String(source.ExecutionMoment);
        }
        if (source.Args != null) {
            this.Args = new String[source.Args.length];
            for (int i = 0; i < source.Args.length; i++) {
                this.Args[i] = new String(source.Args[i]);
            }
        }
        if (source.CosFileName != null) {
            this.CosFileName = new String(source.CosFileName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CosFileURI", this.CosFileURI);
        this.setParamSimple(map, prefix + "ExecutionMoment", this.ExecutionMoment);
        this.setParamArraySimple(map, prefix + "Args.", this.Args);
        this.setParamSimple(map, prefix + "CosFileName", this.CosFileName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

