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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSubnetsRequest extends AbstractModel{

    /**
    * The `ID` of the `VPC` instance, such as `vpc-6v2ht8q5`.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * The subnet object list.
    */
    @SerializedName("Subnets")
    @Expose
    private SubnetInput [] Subnets;

    /**
    * Bound tags. Note that the collection of tags here is shared by all subnet objects in the list. You cannot specify tags for each subnet. Example: [{"Key": "city", "Value": "shanghai"}].
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * ID of the CDC instance to which the subnets will be created
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
     * Get The `ID` of the `VPC` instance, such as `vpc-6v2ht8q5`. 
     * @return VpcId The `ID` of the `VPC` instance, such as `vpc-6v2ht8q5`.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set The `ID` of the `VPC` instance, such as `vpc-6v2ht8q5`.
     * @param VpcId The `ID` of the `VPC` instance, such as `vpc-6v2ht8q5`.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get The subnet object list. 
     * @return Subnets The subnet object list.
     */
    public SubnetInput [] getSubnets() {
        return this.Subnets;
    }

    /**
     * Set The subnet object list.
     * @param Subnets The subnet object list.
     */
    public void setSubnets(SubnetInput [] Subnets) {
        this.Subnets = Subnets;
    }

    /**
     * Get Bound tags. Note that the collection of tags here is shared by all subnet objects in the list. You cannot specify tags for each subnet. Example: [{"Key": "city", "Value": "shanghai"}]. 
     * @return Tags Bound tags. Note that the collection of tags here is shared by all subnet objects in the list. You cannot specify tags for each subnet. Example: [{"Key": "city", "Value": "shanghai"}].
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Bound tags. Note that the collection of tags here is shared by all subnet objects in the list. You cannot specify tags for each subnet. Example: [{"Key": "city", "Value": "shanghai"}].
     * @param Tags Bound tags. Note that the collection of tags here is shared by all subnet objects in the list. You cannot specify tags for each subnet. Example: [{"Key": "city", "Value": "shanghai"}].
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get ID of the CDC instance to which the subnets will be created 
     * @return CdcId ID of the CDC instance to which the subnets will be created
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set ID of the CDC instance to which the subnets will be created
     * @param CdcId ID of the CDC instance to which the subnets will be created
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    public CreateSubnetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSubnetsRequest(CreateSubnetsRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Subnets != null) {
            this.Subnets = new SubnetInput[source.Subnets.length];
            for (int i = 0; i < source.Subnets.length; i++) {
                this.Subnets[i] = new SubnetInput(source.Subnets[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.CdcId != null) {
            this.CdcId = new String(source.CdcId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArrayObj(map, prefix + "Subnets.", this.Subnets);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);

    }
}

