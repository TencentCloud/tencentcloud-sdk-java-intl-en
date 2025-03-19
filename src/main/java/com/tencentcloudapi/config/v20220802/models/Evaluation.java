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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Evaluation extends AbstractModel {

    /**
    * Evaluated resource id. It can contain 0 to 256 characters.
    */
    @SerializedName("ComplianceResourceId")
    @Expose
    private String ComplianceResourceId;

    /**
    * Evaluated resource type.
Supported:
QCS::CVM::Instance、 QCS::CBS::Disk、QCS::VPC::Vpc、QCS::VPC::Subnet、QCS::VPC::SecurityGroup、 QCS::CAM::User、QCS::CAM::Group、QCS::CAM::Policy、QCS::CAM::Role、QCS::COS::Bucket
    */
    @SerializedName("ComplianceResourceType")
    @Expose
    private String ComplianceResourceType;

    /**
    * Evaluated resource region.
It can contain 0 to 32 characters.
    */
    @SerializedName("ComplianceRegion")
    @Expose
    private String ComplianceRegion;

    /**
    * Compliance type. Valid values:
COMPLIANT: Compliant,
NON_COMPLIANT: Non-compliant
    */
    @SerializedName("ComplianceType")
    @Expose
    private String ComplianceType;

    /**
    * Supplementary information for non-compliant resources.
    */
    @SerializedName("Annotation")
    @Expose
    private Annotation Annotation;

    /**
     * Get Evaluated resource id. It can contain 0 to 256 characters. 
     * @return ComplianceResourceId Evaluated resource id. It can contain 0 to 256 characters.
     */
    public String getComplianceResourceId() {
        return this.ComplianceResourceId;
    }

    /**
     * Set Evaluated resource id. It can contain 0 to 256 characters.
     * @param ComplianceResourceId Evaluated resource id. It can contain 0 to 256 characters.
     */
    public void setComplianceResourceId(String ComplianceResourceId) {
        this.ComplianceResourceId = ComplianceResourceId;
    }

    /**
     * Get Evaluated resource type.
Supported:
QCS::CVM::Instance、 QCS::CBS::Disk、QCS::VPC::Vpc、QCS::VPC::Subnet、QCS::VPC::SecurityGroup、 QCS::CAM::User、QCS::CAM::Group、QCS::CAM::Policy、QCS::CAM::Role、QCS::COS::Bucket 
     * @return ComplianceResourceType Evaluated resource type.
Supported:
QCS::CVM::Instance、 QCS::CBS::Disk、QCS::VPC::Vpc、QCS::VPC::Subnet、QCS::VPC::SecurityGroup、 QCS::CAM::User、QCS::CAM::Group、QCS::CAM::Policy、QCS::CAM::Role、QCS::COS::Bucket
     */
    public String getComplianceResourceType() {
        return this.ComplianceResourceType;
    }

    /**
     * Set Evaluated resource type.
Supported:
QCS::CVM::Instance、 QCS::CBS::Disk、QCS::VPC::Vpc、QCS::VPC::Subnet、QCS::VPC::SecurityGroup、 QCS::CAM::User、QCS::CAM::Group、QCS::CAM::Policy、QCS::CAM::Role、QCS::COS::Bucket
     * @param ComplianceResourceType Evaluated resource type.
Supported:
QCS::CVM::Instance、 QCS::CBS::Disk、QCS::VPC::Vpc、QCS::VPC::Subnet、QCS::VPC::SecurityGroup、 QCS::CAM::User、QCS::CAM::Group、QCS::CAM::Policy、QCS::CAM::Role、QCS::COS::Bucket
     */
    public void setComplianceResourceType(String ComplianceResourceType) {
        this.ComplianceResourceType = ComplianceResourceType;
    }

    /**
     * Get Evaluated resource region.
It can contain 0 to 32 characters. 
     * @return ComplianceRegion Evaluated resource region.
It can contain 0 to 32 characters.
     */
    public String getComplianceRegion() {
        return this.ComplianceRegion;
    }

    /**
     * Set Evaluated resource region.
It can contain 0 to 32 characters.
     * @param ComplianceRegion Evaluated resource region.
It can contain 0 to 32 characters.
     */
    public void setComplianceRegion(String ComplianceRegion) {
        this.ComplianceRegion = ComplianceRegion;
    }

    /**
     * Get Compliance type. Valid values:
COMPLIANT: Compliant,
NON_COMPLIANT: Non-compliant 
     * @return ComplianceType Compliance type. Valid values:
COMPLIANT: Compliant,
NON_COMPLIANT: Non-compliant
     */
    public String getComplianceType() {
        return this.ComplianceType;
    }

    /**
     * Set Compliance type. Valid values:
COMPLIANT: Compliant,
NON_COMPLIANT: Non-compliant
     * @param ComplianceType Compliance type. Valid values:
COMPLIANT: Compliant,
NON_COMPLIANT: Non-compliant
     */
    public void setComplianceType(String ComplianceType) {
        this.ComplianceType = ComplianceType;
    }

    /**
     * Get Supplementary information for non-compliant resources. 
     * @return Annotation Supplementary information for non-compliant resources.
     */
    public Annotation getAnnotation() {
        return this.Annotation;
    }

    /**
     * Set Supplementary information for non-compliant resources.
     * @param Annotation Supplementary information for non-compliant resources.
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

