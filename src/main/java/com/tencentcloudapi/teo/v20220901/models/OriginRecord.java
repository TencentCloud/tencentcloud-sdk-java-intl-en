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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OriginRecord extends AbstractModel {

    /**
    * Origin server record value, excluding port information. It can be an IPv4 address, IPv6 address, or domain name format.
    */
    @SerializedName("Record")
    @Expose
    private String Record;

    /**
    * Origin server type. Valid values:
<li>IP_DOMAIN: IPV4, IPV6, domain type origin server;</li>
<li>COS: COS origin.</li>
<li>AWS_S3: AWS S3 COS origin server.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Origin record ID.
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * 【Origin server weight】: A parameter used to control traffic assignment priority. Value range: 0-100 (integer): <li>Empty value: No weight is set, and the system schedules traffic based on the default policy;</li><li>0: The weight is explicitly set to 0, and traffic will not be assigned to this origin server. Note: Make sure at least one origin server has a weight above 0;</li><li>Normal value: The larger the value, the more traffic is assigned;</li>
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * Whether to use private authentication. This parameter is valid only when RecordType is COS or AWS_S3. Valid values:
<li>true: Enable private authentication;</li>
<li>false: Do not use private authentication.</li>Not specified. Default value: false.

    */
    @SerializedName("Private")
    @Expose
    private Boolean Private;

    /**
    * Private authentication parameter. Valid when the origin server type is Private=true.
    */
    @SerializedName("PrivateParameters")
    @Expose
    private PrivateParameter [] PrivateParameters;

    /**
     * Get Origin server record value, excluding port information. It can be an IPv4 address, IPv6 address, or domain name format. 
     * @return Record Origin server record value, excluding port information. It can be an IPv4 address, IPv6 address, or domain name format.
     */
    public String getRecord() {
        return this.Record;
    }

    /**
     * Set Origin server record value, excluding port information. It can be an IPv4 address, IPv6 address, or domain name format.
     * @param Record Origin server record value, excluding port information. It can be an IPv4 address, IPv6 address, or domain name format.
     */
    public void setRecord(String Record) {
        this.Record = Record;
    }

    /**
     * Get Origin server type. Valid values:
<li>IP_DOMAIN: IPV4, IPV6, domain type origin server;</li>
<li>COS: COS origin.</li>
<li>AWS_S3: AWS S3 COS origin server.</li> 
     * @return Type Origin server type. Valid values:
<li>IP_DOMAIN: IPV4, IPV6, domain type origin server;</li>
<li>COS: COS origin.</li>
<li>AWS_S3: AWS S3 COS origin server.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Origin server type. Valid values:
<li>IP_DOMAIN: IPV4, IPV6, domain type origin server;</li>
<li>COS: COS origin.</li>
<li>AWS_S3: AWS S3 COS origin server.</li>
     * @param Type Origin server type. Valid values:
<li>IP_DOMAIN: IPV4, IPV6, domain type origin server;</li>
<li>COS: COS origin.</li>
<li>AWS_S3: AWS S3 COS origin server.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Origin record ID. 
     * @return RecordId Origin record ID.
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set Origin record ID.
     * @param RecordId Origin record ID.
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get 【Origin server weight】: A parameter used to control traffic assignment priority. Value range: 0-100 (integer): <li>Empty value: No weight is set, and the system schedules traffic based on the default policy;</li><li>0: The weight is explicitly set to 0, and traffic will not be assigned to this origin server. Note: Make sure at least one origin server has a weight above 0;</li><li>Normal value: The larger the value, the more traffic is assigned;</li> 
     * @return Weight 【Origin server weight】: A parameter used to control traffic assignment priority. Value range: 0-100 (integer): <li>Empty value: No weight is set, and the system schedules traffic based on the default policy;</li><li>0: The weight is explicitly set to 0, and traffic will not be assigned to this origin server. Note: Make sure at least one origin server has a weight above 0;</li><li>Normal value: The larger the value, the more traffic is assigned;</li>
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 【Origin server weight】: A parameter used to control traffic assignment priority. Value range: 0-100 (integer): <li>Empty value: No weight is set, and the system schedules traffic based on the default policy;</li><li>0: The weight is explicitly set to 0, and traffic will not be assigned to this origin server. Note: Make sure at least one origin server has a weight above 0;</li><li>Normal value: The larger the value, the more traffic is assigned;</li>
     * @param Weight 【Origin server weight】: A parameter used to control traffic assignment priority. Value range: 0-100 (integer): <li>Empty value: No weight is set, and the system schedules traffic based on the default policy;</li><li>0: The weight is explicitly set to 0, and traffic will not be assigned to this origin server. Note: Make sure at least one origin server has a weight above 0;</li><li>Normal value: The larger the value, the more traffic is assigned;</li>
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get Whether to use private authentication. This parameter is valid only when RecordType is COS or AWS_S3. Valid values:
<li>true: Enable private authentication;</li>
<li>false: Do not use private authentication.</li>Not specified. Default value: false.
 
     * @return Private Whether to use private authentication. This parameter is valid only when RecordType is COS or AWS_S3. Valid values:
<li>true: Enable private authentication;</li>
<li>false: Do not use private authentication.</li>Not specified. Default value: false.

     */
    public Boolean getPrivate() {
        return this.Private;
    }

    /**
     * Set Whether to use private authentication. This parameter is valid only when RecordType is COS or AWS_S3. Valid values:
<li>true: Enable private authentication;</li>
<li>false: Do not use private authentication.</li>Not specified. Default value: false.

     * @param Private Whether to use private authentication. This parameter is valid only when RecordType is COS or AWS_S3. Valid values:
<li>true: Enable private authentication;</li>
<li>false: Do not use private authentication.</li>Not specified. Default value: false.

     */
    public void setPrivate(Boolean Private) {
        this.Private = Private;
    }

    /**
     * Get Private authentication parameter. Valid when the origin server type is Private=true. 
     * @return PrivateParameters Private authentication parameter. Valid when the origin server type is Private=true.
     */
    public PrivateParameter [] getPrivateParameters() {
        return this.PrivateParameters;
    }

    /**
     * Set Private authentication parameter. Valid when the origin server type is Private=true.
     * @param PrivateParameters Private authentication parameter. Valid when the origin server type is Private=true.
     */
    public void setPrivateParameters(PrivateParameter [] PrivateParameters) {
        this.PrivateParameters = PrivateParameters;
    }

    public OriginRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginRecord(OriginRecord source) {
        if (source.Record != null) {
            this.Record = new String(source.Record);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.Private != null) {
            this.Private = new Boolean(source.Private);
        }
        if (source.PrivateParameters != null) {
            this.PrivateParameters = new PrivateParameter[source.PrivateParameters.length];
            for (int i = 0; i < source.PrivateParameters.length; i++) {
                this.PrivateParameters[i] = new PrivateParameter(source.PrivateParameters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Record", this.Record);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "Private", this.Private);
        this.setParamArrayObj(map, prefix + "PrivateParameters.", this.PrivateParameters);

    }
}

