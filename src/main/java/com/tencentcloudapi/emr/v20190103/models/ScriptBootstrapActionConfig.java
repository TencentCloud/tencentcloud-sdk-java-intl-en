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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScriptBootstrapActionConfig extends AbstractModel{

    /**
    * The COS URL of the script, in the format of `https://beijing-111111.cos.ap-beijing.myqcloud.com/data/test.sh`. For the COS bucket list, see [Bucket List](https://console.cloud.tencent.com/cos/bucket).
    */
    @SerializedName("CosFileURI")
    @Expose
    private String CosFileURI;

    /**
    * The execution time of the bootstrap action script. Valid values:
<li>`resourceAfter`: After node initialization</li>
<li>`clusterAfter`: After cluster start</li>
<li>`clusterBefore`: Before cluster start</li>
    */
    @SerializedName("ExecutionMoment")
    @Expose
    private String ExecutionMoment;

    /**
    * The execution script parameter. The parameter format must comply with standard shell specifications.
    */
    @SerializedName("Args")
    @Expose
    private String [] Args;

    /**
    * The script file name.
    */
    @SerializedName("CosFileName")
    @Expose
    private String CosFileName;

    /**
     * Get The COS URL of the script, in the format of `https://beijing-111111.cos.ap-beijing.myqcloud.com/data/test.sh`. For the COS bucket list, see [Bucket List](https://console.cloud.tencent.com/cos/bucket). 
     * @return CosFileURI The COS URL of the script, in the format of `https://beijing-111111.cos.ap-beijing.myqcloud.com/data/test.sh`. For the COS bucket list, see [Bucket List](https://console.cloud.tencent.com/cos/bucket).
     */
    public String getCosFileURI() {
        return this.CosFileURI;
    }

    /**
     * Set The COS URL of the script, in the format of `https://beijing-111111.cos.ap-beijing.myqcloud.com/data/test.sh`. For the COS bucket list, see [Bucket List](https://console.cloud.tencent.com/cos/bucket).
     * @param CosFileURI The COS URL of the script, in the format of `https://beijing-111111.cos.ap-beijing.myqcloud.com/data/test.sh`. For the COS bucket list, see [Bucket List](https://console.cloud.tencent.com/cos/bucket).
     */
    public void setCosFileURI(String CosFileURI) {
        this.CosFileURI = CosFileURI;
    }

    /**
     * Get The execution time of the bootstrap action script. Valid values:
<li>`resourceAfter`: After node initialization</li>
<li>`clusterAfter`: After cluster start</li>
<li>`clusterBefore`: Before cluster start</li> 
     * @return ExecutionMoment The execution time of the bootstrap action script. Valid values:
<li>`resourceAfter`: After node initialization</li>
<li>`clusterAfter`: After cluster start</li>
<li>`clusterBefore`: Before cluster start</li>
     */
    public String getExecutionMoment() {
        return this.ExecutionMoment;
    }

    /**
     * Set The execution time of the bootstrap action script. Valid values:
<li>`resourceAfter`: After node initialization</li>
<li>`clusterAfter`: After cluster start</li>
<li>`clusterBefore`: Before cluster start</li>
     * @param ExecutionMoment The execution time of the bootstrap action script. Valid values:
<li>`resourceAfter`: After node initialization</li>
<li>`clusterAfter`: After cluster start</li>
<li>`clusterBefore`: Before cluster start</li>
     */
    public void setExecutionMoment(String ExecutionMoment) {
        this.ExecutionMoment = ExecutionMoment;
    }

    /**
     * Get The execution script parameter. The parameter format must comply with standard shell specifications. 
     * @return Args The execution script parameter. The parameter format must comply with standard shell specifications.
     */
    public String [] getArgs() {
        return this.Args;
    }

    /**
     * Set The execution script parameter. The parameter format must comply with standard shell specifications.
     * @param Args The execution script parameter. The parameter format must comply with standard shell specifications.
     */
    public void setArgs(String [] Args) {
        this.Args = Args;
    }

    /**
     * Get The script file name. 
     * @return CosFileName The script file name.
     */
    public String getCosFileName() {
        return this.CosFileName;
    }

    /**
     * Set The script file name.
     * @param CosFileName The script file name.
     */
    public void setCosFileName(String CosFileName) {
        this.CosFileName = CosFileName;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CosFileURI", this.CosFileURI);
        this.setParamSimple(map, prefix + "ExecutionMoment", this.ExecutionMoment);
        this.setParamArraySimple(map, prefix + "Args.", this.Args);
        this.setParamSimple(map, prefix + "CosFileName", this.CosFileName);

    }
}

