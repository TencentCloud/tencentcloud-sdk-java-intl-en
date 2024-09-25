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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTopAttackDomainRequest extends AbstractModel {

    /**
    * Query start time
    */
    @SerializedName("FromTime")
    @Expose
    private String FromTime;

    /**
    * Query end time
    */
    @SerializedName("ToTime")
    @Expose
    private String ToTime;

    /**
    * Top N, selectable from 0-10. The default is 10.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Only two values are valid: sparta-waf, clb-waf. No filtering if not input.
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * WAF instance ID. No filter will be carried out if it is not input.
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
     * Get Query start time 
     * @return FromTime Query start time
     */
    public String getFromTime() {
        return this.FromTime;
    }

    /**
     * Set Query start time
     * @param FromTime Query start time
     */
    public void setFromTime(String FromTime) {
        this.FromTime = FromTime;
    }

    /**
     * Get Query end time 
     * @return ToTime Query end time
     */
    public String getToTime() {
        return this.ToTime;
    }

    /**
     * Set Query end time
     * @param ToTime Query end time
     */
    public void setToTime(String ToTime) {
        this.ToTime = ToTime;
    }

    /**
     * Get Top N, selectable from 0-10. The default is 10. 
     * @return Count Top N, selectable from 0-10. The default is 10.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Top N, selectable from 0-10. The default is 10.
     * @param Count Top N, selectable from 0-10. The default is 10.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Only two values are valid: sparta-waf, clb-waf. No filtering if not input. 
     * @return Edition Only two values are valid: sparta-waf, clb-waf. No filtering if not input.
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set Only two values are valid: sparta-waf, clb-waf. No filtering if not input.
     * @param Edition Only two values are valid: sparta-waf, clb-waf. No filtering if not input.
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get WAF instance ID. No filter will be carried out if it is not input. 
     * @return InstanceID WAF instance ID. No filter will be carried out if it is not input.
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set WAF instance ID. No filter will be carried out if it is not input.
     * @param InstanceID WAF instance ID. No filter will be carried out if it is not input.
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    public DescribeTopAttackDomainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTopAttackDomainRequest(DescribeTopAttackDomainRequest source) {
        if (source.FromTime != null) {
            this.FromTime = new String(source.FromTime);
        }
        if (source.ToTime != null) {
            this.ToTime = new String(source.ToTime);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FromTime", this.FromTime);
        this.setParamSimple(map, prefix + "ToTime", this.ToTime);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);

    }
}

