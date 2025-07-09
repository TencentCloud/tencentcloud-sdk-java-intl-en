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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchTaskOperateNew extends AbstractModel {

    /**
    * Operation ID.

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("JobId")
    @Expose
    private Long JobId;

    /**
     * Get Operation ID.

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return JobId Operation ID.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getJobId() {
        return this.JobId;
    }

    /**
     * Set Operation ID.

Note: This field may return null, indicating that no valid values can be obtained.
     * @param JobId Operation ID.

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setJobId(Long JobId) {
        this.JobId = JobId;
    }

    public BatchTaskOperateNew() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchTaskOperateNew(BatchTaskOperateNew source) {
        if (source.JobId != null) {
            this.JobId = new Long(source.JobId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);

    }
}

