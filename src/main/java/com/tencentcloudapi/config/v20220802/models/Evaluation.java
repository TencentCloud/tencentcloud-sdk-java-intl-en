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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Evaluation extends AbstractModel {

    /**
    * Evaluated resource ID, which is 0 to 256 characters in length.
    */
    @SerializedName("ComplianceResourceId")
    @Expose
    private String ComplianceResourceId;

    /**
    * Evaluated resource type.
Support
QCS::CVM::Instance, QCS::CBS::Disk,QCS::VPC::Vpc,QCS::VPC::Subnet,QCS::VPC::SecurityGroup, QCS::CAM::User,QCS::CAM::Group,QCS::CAM::Policy,QCS::CAM::Role,QCS::COS::Bucket
    */
    @SerializedName("ComplianceResourceType")
    @Expose
    private String ComplianceResourceType;

    /**
    * Evaluated resource region.
0 to 32 characters in length.
    */
    @SerializedName("ComplianceRegion")
    @Expose
    private String ComplianceRegion;

    /**
    * Compliance type. Value:
COMPLIANT: compliant
NON_COMPLIANT: non-compliance
    */
    @SerializedName("ComplianceType")
    @Expose
    private String ComplianceType;

    /**
    * Supplementary information of non-compliant resources.
    */
    @SerializedName("Annotation")
    @Expose
    private Annotation Annotation;

    /**
     * Get Evaluated resource ID, which is 0 to 256 characters in length. 
     * @return ComplianceResourceId Evaluated resource ID, which is 0 to 256 characters in length.
     */
    public String getComplianceResourceId() {
        return this.ComplianceResourceId;
    }

    /**
     * Set Evaluated resource ID, which is 0 to 256 characters in length.
     * @param ComplianceResourceId Evaluated resource ID, which is 0 to 256 characters in length.
     */
    public void setComplianceResourceId(String ComplianceResourceId) {
        this.ComplianceResourceId = ComplianceResourceId;
    }

    /**
     * Get Evaluated resource type.
Support
QCS::CVM::Instance, QCS::CBS::Disk,QCS::VPC::Vpc,QCS::VPC::Subnet,QCS::VPC::SecurityGroup, QCS::CAM::User,QCS::CAM::Group,QCS::CAM::Policy,QCS::CAM::Role,QCS::COS::Bucket 
     * @return ComplianceResourceType Evaluated resource type.
Support
QCS::CVM::Instance, QCS::CBS::Disk,QCS::VPC::Vpc,QCS::VPC::Subnet,QCS::VPC::SecurityGroup, QCS::CAM::User,QCS::CAM::Group,QCS::CAM::Policy,QCS::CAM::Role,QCS::COS::Bucket
     */
    public String getComplianceResourceType() {
        return this.ComplianceResourceType;
    }

    /**
     * Set Evaluated resource type.
Support
QCS::CVM::Instance, QCS::CBS::Disk,QCS::VPC::Vpc,QCS::VPC::Subnet,QCS::VPC::SecurityGroup, QCS::CAM::User,QCS::CAM::Group,QCS::CAM::Policy,QCS::CAM::Role,QCS::COS::Bucket
     * @param ComplianceResourceType Evaluated resource type.
Support
QCS::CVM::Instance, QCS::CBS::Disk,QCS::VPC::Vpc,QCS::VPC::Subnet,QCS::VPC::SecurityGroup, QCS::CAM::User,QCS::CAM::Group,QCS::CAM::Policy,QCS::CAM::Role,QCS::COS::Bucket
     */
    public void setComplianceResourceType(String ComplianceResourceType) {
        this.ComplianceResourceType = ComplianceResourceType;
    }

    /**
     * Get Evaluated resource region.
0 to 32 characters in length. 
     * @return ComplianceRegion Evaluated resource region.
0 to 32 characters in length.
     */
    public String getComplianceRegion() {
        return this.ComplianceRegion;
    }

    /**
     * Set Evaluated resource region.
0 to 32 characters in length.
     * @param ComplianceRegion Evaluated resource region.
0 to 32 characters in length.
     */
    public void setComplianceRegion(String ComplianceRegion) {
        this.ComplianceRegion = ComplianceRegion;
    }

    /**
     * Get Compliance type. Value:
COMPLIANT: compliant
NON_COMPLIANT: non-compliance 
     * @return ComplianceType Compliance type. Value:
COMPLIANT: compliant
NON_COMPLIANT: non-compliance
     */
    public String getComplianceType() {
        return this.ComplianceType;
    }

    /**
     * Set Compliance type. Value:
COMPLIANT: compliant
NON_COMPLIANT: non-compliance
     * @param ComplianceType Compliance type. Value:
COMPLIANT: compliant
NON_COMPLIANT: non-compliance
     */
    public void setComplianceType(String ComplianceType) {
        this.ComplianceType = ComplianceType;
    }

    /**
     * Get Supplementary information of non-compliant resources. 
     * @return Annotation Supplementary information of non-compliant resources.
     */
    public Annotation getAnnotation() {
        return this.Annotation;
    }

    /**
     * Set Supplementary information of non-compliant resources.
     * @param Annotation Supplementary information of non-compliant resources.
     */
    public void setAnnotation(Annotation Annotation) {
        this.Annotation = Annotation;
    }

    public Evaluation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Evaluation(Evaluation source) {
        if (source.ComplianceResourceId != null) {
            this.ComplianceResourceId = new String(source.ComplianceResourceId);
        }
        if (source.ComplianceResourceType != null) {
            this.ComplianceResourceType = new String(source.ComplianceResourceType);
        }
        if (source.ComplianceRegion != null) {
            this.ComplianceRegion = new String(source.ComplianceRegion);
        }
        if (source.ComplianceType != null) {
            this.ComplianceType = new String(source.ComplianceType);
        }
        if (source.Annotation != null) {
            this.Annotation = new Annotation(source.Annotation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComplianceResourceId", this.ComplianceResourceId);
        this.setParamSimple(map, prefix + "ComplianceResourceType", this.ComplianceResourceType);
        this.setParamSimple(map, prefix + "ComplianceRegion", this.ComplianceRegion);
        this.setParamSimple(map, prefix + "ComplianceType", this.ComplianceType);
        this.setParamObj(map, prefix + "Annotation.", this.Annotation);

    }
}

