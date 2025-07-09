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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FailedResource extends AbstractModel {

    /**
    * 6-Segment resource

Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
    * Reason for execution failure
Note: This field may return "null", indicating that no valid value can be obtained.
    */
    @SerializedName("Error")
    @Expose
    private String Error;

    /**
     * Get 6-Segment resource

Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Resource 6-Segment resource

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * Set 6-Segment resource

Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Resource 6-Segment resource

Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * Get Reason for execution failure
Note: This field may return "null", indicating that no valid value can be obtained. 
     * @return Error Reason for execution failure
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public String getError() {
        return this.Error;
    }

    /**
     * Set Reason for execution failure
Note: This field may return "null", indicating that no valid value can be obtained.
     * @param Error Reason for execution failure
Note: This field may return "null", indicating that no valid value can be obtained.
     */
    public void setError(String Error) {
        this.Error = Error;
    }

    public FailedResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FailedResource(FailedResource source) {
        if (source.Resource != null) {
            this.Resource = new String(source.Resource);
        }
        if (source.Error != null) {
            this.Error = new String(source.Error);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Resource", this.Resource);
        this.setParamSimple(map, prefix + "Error", this.Error);

    }
}

