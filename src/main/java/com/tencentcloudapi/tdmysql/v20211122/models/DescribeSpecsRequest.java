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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSpecsRequest extends AbstractModel {

    /**
    * <p>Number of replicas. Currently supported range: 1-3. Default is 3.</p>
    */
    @SerializedName("FullReplications")
    @Expose
    private Long FullReplications;

    /**
    * <p>Exclusive instance</p>
    */
    @SerializedName("IsExclusiveInstance")
    @Expose
    private Long IsExclusiveInstance;

    /**
     * Get <p>Number of replicas. Currently supported range: 1-3. Default is 3.</p> 
     * @return FullReplications <p>Number of replicas. Currently supported range: 1-3. Default is 3.</p>
     */
    public Long getFullReplications() {
        return this.FullReplications;
    }

    /**
     * Set <p>Number of replicas. Currently supported range: 1-3. Default is 3.</p>
     * @param FullReplications <p>Number of replicas. Currently supported range: 1-3. Default is 3.</p>
     */
    public void setFullReplications(Long FullReplications) {
        this.FullReplications = FullReplications;
    }

    /**
     * Get <p>Exclusive instance</p> 
     * @return IsExclusiveInstance <p>Exclusive instance</p>
     */
    public Long getIsExclusiveInstance() {
        return this.IsExclusiveInstance;
    }

    /**
     * Set <p>Exclusive instance</p>
     * @param IsExclusiveInstance <p>Exclusive instance</p>
     */
    public void setIsExclusiveInstance(Long IsExclusiveInstance) {
        this.IsExclusiveInstance = IsExclusiveInstance;
    }

    public DescribeSpecsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSpecsRequest(DescribeSpecsRequest source) {
        if (source.FullReplications != null) {
            this.FullReplications = new Long(source.FullReplications);
        }
        if (source.IsExclusiveInstance != null) {
            this.IsExclusiveInstance = new Long(source.IsExclusiveInstance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FullReplications", this.FullReplications);
        this.setParamSimple(map, prefix + "IsExclusiveInstance", this.IsExclusiveInstance);

    }
}

