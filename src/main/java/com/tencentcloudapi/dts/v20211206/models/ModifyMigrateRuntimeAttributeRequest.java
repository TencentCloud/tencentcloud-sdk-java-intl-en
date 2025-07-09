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

public class ModifyMigrateRuntimeAttributeRequest extends AbstractModel {

    /**
    * Migration task id, for example: dts-2rgv0f09
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * Attributes that need to be modified. This structure is designed as a generic structure to separate customized attributes for multiple businesses. <br>For instance, for Redis:<br>{<br>	 "Key": "DstWriteMode",	// Target database write mode<br> 	"Value": "normal"	          // clearData (clear target instance data), overwrite (perform task in overwrite manner), normal (follow normal procedure, no additional actions, this is the default value) <br>},<br>{<br/>	 "Key": "IsDstReadOnly",	// Whether to set target database as read-only during migration<br/> 	"Value": "true"	          // true (set as read-only), false (do not set as read-only) <br/>}
    */
    @SerializedName("OtherOptions")
    @Expose
    private KeyValuePairOption [] OtherOptions;

    /**
     * Get Migration task id, for example: dts-2rgv0f09 
     * @return JobId Migration task id, for example: dts-2rgv0f09
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set Migration task id, for example: dts-2rgv0f09
     * @param JobId Migration task id, for example: dts-2rgv0f09
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get Attributes that need to be modified. This structure is designed as a generic structure to separate customized attributes for multiple businesses. <br>For instance, for Redis:<br>{<br>	 "Key": "DstWriteMode",	// Target database write mode<br> 	"Value": "normal"	          // clearData (clear target instance data), overwrite (perform task in overwrite manner), normal (follow normal procedure, no additional actions, this is the default value) <br>},<br>{<br/>	 "Key": "IsDstReadOnly",	// Whether to set target database as read-only during migration<br/> 	"Value": "true"	          // true (set as read-only), false (do not set as read-only) <br/>} 
     * @return OtherOptions Attributes that need to be modified. This structure is designed as a generic structure to separate customized attributes for multiple businesses. <br>For instance, for Redis:<br>{<br>	 "Key": "DstWriteMode",	// Target database write mode<br> 	"Value": "normal"	          // clearData (clear target instance data), overwrite (perform task in overwrite manner), normal (follow normal procedure, no additional actions, this is the default value) <br>},<br>{<br/>	 "Key": "IsDstReadOnly",	// Whether to set target database as read-only during migration<br/> 	"Value": "true"	          // true (set as read-only), false (do not set as read-only) <br/>}
     */
    public KeyValuePairOption [] getOtherOptions() {
        return this.OtherOptions;
    }

    /**
     * Set Attributes that need to be modified. This structure is designed as a generic structure to separate customized attributes for multiple businesses. <br>For instance, for Redis:<br>{<br>	 "Key": "DstWriteMode",	// Target database write mode<br> 	"Value": "normal"	          // clearData (clear target instance data), overwrite (perform task in overwrite manner), normal (follow normal procedure, no additional actions, this is the default value) <br>},<br>{<br/>	 "Key": "IsDstReadOnly",	// Whether to set target database as read-only during migration<br/> 	"Value": "true"	          // true (set as read-only), false (do not set as read-only) <br/>}
     * @param OtherOptions Attributes that need to be modified. This structure is designed as a generic structure to separate customized attributes for multiple businesses. <br>For instance, for Redis:<br>{<br>	 "Key": "DstWriteMode",	// Target database write mode<br> 	"Value": "normal"	          // clearData (clear target instance data), overwrite (perform task in overwrite manner), normal (follow normal procedure, no additional actions, this is the default value) <br>},<br>{<br/>	 "Key": "IsDstReadOnly",	// Whether to set target database as read-only during migration<br/> 	"Value": "true"	          // true (set as read-only), false (do not set as read-only) <br/>}
     */
    public void setOtherOptions(KeyValuePairOption [] OtherOptions) {
        this.OtherOptions = OtherOptions;
    }

    public ModifyMigrateRuntimeAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMigrateRuntimeAttributeRequest(ModifyMigrateRuntimeAttributeRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.OtherOptions != null) {
            this.OtherOptions = new KeyValuePairOption[source.OtherOptions.length];
            for (int i = 0; i < source.OtherOptions.length; i++) {
                this.OtherOptions[i] = new KeyValuePairOption(source.OtherOptions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamArrayObj(map, prefix + "OtherOptions.", this.OtherOptions);

    }
}

