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

public class LogSetInfo extends AbstractModel{

    /**
    * Region of the logset.
    */
    @SerializedName("LogSetRegion")
    @Expose
    private String LogSetRegion;

    /**
    * Name of the logset.
    */
    @SerializedName("LogSetName")
    @Expose
    private String LogSetName;

    /**
    * ID of the logset.
    */
    @SerializedName("LogSetId")
    @Expose
    private String LogSetId;

    /**
    * Whether the logset is deleted. Values:
<li>`no`: The logset is not deleted;</li>
<li>`yes`: The logset is deleted.</li>
    */
    @SerializedName("Deleted")
    @Expose
    private String Deleted;

    /**
     * Get Region of the logset. 
     * @return LogSetRegion Region of the logset.
     */
    public String getLogSetRegion() {
        return this.LogSetRegion;
    }

    /**
     * Set Region of the logset.
     * @param LogSetRegion Region of the logset.
     */
    public void setLogSetRegion(String LogSetRegion) {
        this.LogSetRegion = LogSetRegion;
    }

    /**
     * Get Name of the logset. 
     * @return LogSetName Name of the logset.
     */
    public String getLogSetName() {
        return this.LogSetName;
    }

    /**
     * Set Name of the logset.
     * @param LogSetName Name of the logset.
     */
    public void setLogSetName(String LogSetName) {
        this.LogSetName = LogSetName;
    }

    /**
     * Get ID of the logset. 
     * @return LogSetId ID of the logset.
     */
    public String getLogSetId() {
        return this.LogSetId;
    }

    /**
     * Set ID of the logset.
     * @param LogSetId ID of the logset.
     */
    public void setLogSetId(String LogSetId) {
        this.LogSetId = LogSetId;
    }

    /**
     * Get Whether the logset is deleted. Values:
<li>`no`: The logset is not deleted;</li>
<li>`yes`: The logset is deleted.</li> 
     * @return Deleted Whether the logset is deleted. Values:
<li>`no`: The logset is not deleted;</li>
<li>`yes`: The logset is deleted.</li>
     */
    public String getDeleted() {
        return this.Deleted;
    }

    /**
     * Set Whether the logset is deleted. Values:
<li>`no`: The logset is not deleted;</li>
<li>`yes`: The logset is deleted.</li>
     * @param Deleted Whether the logset is deleted. Values:
<li>`no`: The logset is not deleted;</li>
<li>`yes`: The logset is deleted.</li>
     */
    public void setDeleted(String Deleted) {
        this.Deleted = Deleted;
    }

    public LogSetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogSetInfo(LogSetInfo source) {
        if (source.LogSetRegion != null) {
            this.LogSetRegion = new String(source.LogSetRegion);
        }
        if (source.LogSetName != null) {
            this.LogSetName = new String(source.LogSetName);
        }
        if (source.LogSetId != null) {
            this.LogSetId = new String(source.LogSetId);
        }
        if (source.Deleted != null) {
            this.Deleted = new String(source.Deleted);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogSetRegion", this.LogSetRegion);
        this.setParamSimple(map, prefix + "LogSetName", this.LogSetName);
        this.setParamSimple(map, prefix + "LogSetId", this.LogSetId);
        this.setParamSimple(map, prefix + "Deleted", this.Deleted);

    }
}

