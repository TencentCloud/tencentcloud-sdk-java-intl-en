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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCanNotSeparateMachineRequest extends AbstractModel {

    /**
    * An array of event IDs that need to be modified, and batch operation is supported.
    */
    @SerializedName("Ids")
    @Expose
    private Long [] Ids;

    /**
    * Whether to update all, i.e. whether to operate on all events; this parameter is invalid when IDs are not left blank.
    */
    @SerializedName("UpdateAll")
    @Expose
    private Boolean UpdateAll;

    /**
    * Excluded event ID: When operating on all events, this ID needs to be excluded.
    */
    @SerializedName("ExcludeId")
    @Expose
    private Long [] ExcludeId;

    /**
    * <li>IpOrAlias - String - required: no - filter by host IP or alias</li>
<li>FilePath - String - required: no - filter by path</li>
<li>VirusName - String - required: no - filter by description</li>
<li>CreateBeginTime - String - required: no - filter by creation time - start time</li>
<li>CreateEndTime - String - required: no - filter by creation time - end time</li>
<li>Status - String - required: no - status for filtering: 4: pending; 5: trusted; 6: isolated; 10: isolating; 11: canceling isolation</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
     * Get An array of event IDs that need to be modified, and batch operation is supported. 
     * @return Ids An array of event IDs that need to be modified, and batch operation is supported.
     */
    public Long [] getIds() {
        return this.Ids;
    }

    /**
     * Set An array of event IDs that need to be modified, and batch operation is supported.
     * @param Ids An array of event IDs that need to be modified, and batch operation is supported.
     */
    public void setIds(Long [] Ids) {
        this.Ids = Ids;
    }

    /**
     * Get Whether to update all, i.e. whether to operate on all events; this parameter is invalid when IDs are not left blank. 
     * @return UpdateAll Whether to update all, i.e. whether to operate on all events; this parameter is invalid when IDs are not left blank.
     */
    public Boolean getUpdateAll() {
        return this.UpdateAll;
    }

    /**
     * Set Whether to update all, i.e. whether to operate on all events; this parameter is invalid when IDs are not left blank.
     * @param UpdateAll Whether to update all, i.e. whether to operate on all events; this parameter is invalid when IDs are not left blank.
     */
    public void setUpdateAll(Boolean UpdateAll) {
        this.UpdateAll = UpdateAll;
    }

    /**
     * Get Excluded event ID: When operating on all events, this ID needs to be excluded. 
     * @return ExcludeId Excluded event ID: When operating on all events, this ID needs to be excluded.
     */
    public Long [] getExcludeId() {
        return this.ExcludeId;
    }

    /**
     * Set Excluded event ID: When operating on all events, this ID needs to be excluded.
     * @param ExcludeId Excluded event ID: When operating on all events, this ID needs to be excluded.
     */
    public void setExcludeId(Long [] ExcludeId) {
        this.ExcludeId = ExcludeId;
    }

    /**
     * Get <li>IpOrAlias - String - required: no - filter by host IP or alias</li>
<li>FilePath - String - required: no - filter by path</li>
<li>VirusName - String - required: no - filter by description</li>
<li>CreateBeginTime - String - required: no - filter by creation time - start time</li>
<li>CreateEndTime - String - required: no - filter by creation time - end time</li>
<li>Status - String - required: no - status for filtering: 4: pending; 5: trusted; 6: isolated; 10: isolating; 11: canceling isolation</li> 
     * @return Filters <li>IpOrAlias - String - required: no - filter by host IP or alias</li>
<li>FilePath - String - required: no - filter by path</li>
<li>VirusName - String - required: no - filter by description</li>
<li>CreateBeginTime - String - required: no - filter by creation time - start time</li>
<li>CreateEndTime - String - required: no - filter by creation time - end time</li>
<li>Status - String - required: no - status for filtering: 4: pending; 5: trusted; 6: isolated; 10: isolating; 11: canceling isolation</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <li>IpOrAlias - String - required: no - filter by host IP or alias</li>
<li>FilePath - String - required: no - filter by path</li>
<li>VirusName - String - required: no - filter by description</li>
<li>CreateBeginTime - String - required: no - filter by creation time - start time</li>
<li>CreateEndTime - String - required: no - filter by creation time - end time</li>
<li>Status - String - required: no - status for filtering: 4: pending; 5: trusted; 6: isolated; 10: isolating; 11: canceling isolation</li>
     * @param Filters <li>IpOrAlias - String - required: no - filter by host IP or alias</li>
<li>FilePath - String - required: no - filter by path</li>
<li>VirusName - String - required: no - filter by description</li>
<li>CreateBeginTime - String - required: no - filter by creation time - start time</li>
<li>CreateEndTime - String - required: no - filter by creation time - end time</li>
<li>Status - String - required: no - status for filtering: 4: pending; 5: trusted; 6: isolated; 10: isolating; 11: canceling isolation</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    public DescribeCanNotSeparateMachineRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCanNotSeparateMachineRequest(DescribeCanNotSeparateMachineRequest source) {
        if (source.Ids != null) {
            this.Ids = new Long[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new Long(source.Ids[i]);
            }
        }
        if (source.UpdateAll != null) {
            this.UpdateAll = new Boolean(source.UpdateAll);
        }
        if (source.ExcludeId != null) {
            this.ExcludeId = new Long[source.ExcludeId.length];
            for (int i = 0; i < source.ExcludeId.length; i++) {
                this.ExcludeId[i] = new Long(source.ExcludeId[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);
        this.setParamSimple(map, prefix + "UpdateAll", this.UpdateAll);
        this.setParamArraySimple(map, prefix + "ExcludeId.", this.ExcludeId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

