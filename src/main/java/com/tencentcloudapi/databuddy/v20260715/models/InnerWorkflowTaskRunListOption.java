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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InnerWorkflowTaskRunListOption extends AbstractModel {

    /**
    * <p>Page number. Value range: starts from 1. Optional. Default value: 1.</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>Size per page. Optional. Default: 10. Value range: [10, 200]</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>Iterative running state, exact matching. Optional, multiple selection (multiple values are in an OR relationship).</p><p>You can enter SUCCESS / FAILED, for example. For details, refer to the return value of the InnerWorkflowTaskRunIteration.RunState field in the API output parameter.</p>
    */
    @SerializedName("RunStates")
    @Expose
    private String [] RunStates;

    /**
     * Get <p>Page number. Value range: starts from 1. Optional. Default value: 1.</p> 
     * @return PageNumber <p>Page number. Value range: starts from 1. Optional. Default value: 1.</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>Page number. Value range: starts from 1. Optional. Default value: 1.</p>
     * @param PageNumber <p>Page number. Value range: starts from 1. Optional. Default value: 1.</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>Size per page. Optional. Default: 10. Value range: [10, 200]</p> 
     * @return PageSize <p>Size per page. Optional. Default: 10. Value range: [10, 200]</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>Size per page. Optional. Default: 10. Value range: [10, 200]</p>
     * @param PageSize <p>Size per page. Optional. Default: 10. Value range: [10, 200]</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>Iterative running state, exact matching. Optional, multiple selection (multiple values are in an OR relationship).</p><p>You can enter SUCCESS / FAILED, for example. For details, refer to the return value of the InnerWorkflowTaskRunIteration.RunState field in the API output parameter.</p> 
     * @return RunStates <p>Iterative running state, exact matching. Optional, multiple selection (multiple values are in an OR relationship).</p><p>You can enter SUCCESS / FAILED, for example. For details, refer to the return value of the InnerWorkflowTaskRunIteration.RunState field in the API output parameter.</p>
     */
    public String [] getRunStates() {
        return this.RunStates;
    }

    /**
     * Set <p>Iterative running state, exact matching. Optional, multiple selection (multiple values are in an OR relationship).</p><p>You can enter SUCCESS / FAILED, for example. For details, refer to the return value of the InnerWorkflowTaskRunIteration.RunState field in the API output parameter.</p>
     * @param RunStates <p>Iterative running state, exact matching. Optional, multiple selection (multiple values are in an OR relationship).</p><p>You can enter SUCCESS / FAILED, for example. For details, refer to the return value of the InnerWorkflowTaskRunIteration.RunState field in the API output parameter.</p>
     */
    public void setRunStates(String [] RunStates) {
        this.RunStates = RunStates;
    }

    public InnerWorkflowTaskRunListOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InnerWorkflowTaskRunListOption(InnerWorkflowTaskRunListOption source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.RunStates != null) {
            this.RunStates = new String[source.RunStates.length];
            for (int i = 0; i < source.RunStates.length; i++) {
                this.RunStates[i] = new String(source.RunStates[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArraySimple(map, prefix + "RunStates.", this.RunStates);

    }
}

