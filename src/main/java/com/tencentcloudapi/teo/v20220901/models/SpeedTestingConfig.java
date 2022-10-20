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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpeedTestingConfig extends AbstractModel{

    /**
    * The task type. Values:
<li>`1`: Page performance</li>
<li>`2`: File uploads</li>
<li>`3`: File downloads</li>
<li>`4`: Port performance</li>
<li>`5`: Network quality</li>
<li>`6`: Audio/Video experience</li>
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * The URL.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * The user agent.
    */
    @SerializedName("UA")
    @Expose
    private String UA;

    /**
    * The network type.
    */
    @SerializedName("Connectivity")
    @Expose
    private String Connectivity;

    /**
     * Get The task type. Values:
<li>`1`: Page performance</li>
<li>`2`: File uploads</li>
<li>`3`: File downloads</li>
<li>`4`: Port performance</li>
<li>`5`: Network quality</li>
<li>`6`: Audio/Video experience</li> 
     * @return TaskType The task type. Values:
<li>`1`: Page performance</li>
<li>`2`: File uploads</li>
<li>`3`: File downloads</li>
<li>`4`: Port performance</li>
<li>`5`: Network quality</li>
<li>`6`: Audio/Video experience</li>
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set The task type. Values:
<li>`1`: Page performance</li>
<li>`2`: File uploads</li>
<li>`3`: File downloads</li>
<li>`4`: Port performance</li>
<li>`5`: Network quality</li>
<li>`6`: Audio/Video experience</li>
     * @param TaskType The task type. Values:
<li>`1`: Page performance</li>
<li>`2`: File uploads</li>
<li>`3`: File downloads</li>
<li>`4`: Port performance</li>
<li>`5`: Network quality</li>
<li>`6`: Audio/Video experience</li>
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get The URL. 
     * @return Url The URL.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set The URL.
     * @param Url The URL.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get The user agent. 
     * @return UA The user agent.
     */
    public String getUA() {
        return this.UA;
    }

    /**
     * Set The user agent.
     * @param UA The user agent.
     */
    public void setUA(String UA) {
        this.UA = UA;
    }

    /**
     * Get The network type. 
     * @return Connectivity The network type.
     */
    public String getConnectivity() {
        return this.Connectivity;
    }

    /**
     * Set The network type.
     * @param Connectivity The network type.
     */
    public void setConnectivity(String Connectivity) {
        this.Connectivity = Connectivity;
    }

    public SpeedTestingConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpeedTestingConfig(SpeedTestingConfig source) {
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.UA != null) {
            this.UA = new String(source.UA);
        }
        if (source.Connectivity != null) {
            this.Connectivity = new String(source.Connectivity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "UA", this.UA);
        this.setParamSimple(map, prefix + "Connectivity", this.Connectivity);

    }
}

