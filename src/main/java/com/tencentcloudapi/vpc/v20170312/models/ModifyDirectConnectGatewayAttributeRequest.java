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

public class ModifyDirectConnectGatewayAttributeRequest extends AbstractModel{

    /**
    * The unique `ID` of the Direct Connect gateway, such as `dcg-9o233uri`.
    */
    @SerializedName("DirectConnectGatewayId")
    @Expose
    private String DirectConnectGatewayId;

    /**
    * Direct connect gateway can be named freely, but the maximum length is 60 characters.
    */
    @SerializedName("DirectConnectGatewayName")
    @Expose
    private String DirectConnectGatewayName;

    /**
    * CCN route learning type. Available values: `BGP` (Automatic learning), `STATIC` (Static, that is, user-configured). Modifying `CcnRouteType` is only possible if the Direct Connect is CCN-type and the BGP function is enabled.
    */
    @SerializedName("CcnRouteType")
    @Expose
    private String CcnRouteType;

    /**
     * Get The unique `ID` of the Direct Connect gateway, such as `dcg-9o233uri`. 
     * @return DirectConnectGatewayId The unique `ID` of the Direct Connect gateway, such as `dcg-9o233uri`.
     */
    public String getDirectConnectGatewayId() {
        return this.DirectConnectGatewayId;
    }

    /**
     * Set The unique `ID` of the Direct Connect gateway, such as `dcg-9o233uri`.
     * @param DirectConnectGatewayId The unique `ID` of the Direct Connect gateway, such as `dcg-9o233uri`.
     */
    public void setDirectConnectGatewayId(String DirectConnectGatewayId) {
        this.DirectConnectGatewayId = DirectConnectGatewayId;
    }

    /**
     * Get Direct connect gateway can be named freely, but the maximum length is 60 characters. 
     * @return DirectConnectGatewayName Direct connect gateway can be named freely, but the maximum length is 60 characters.
     */
    public String getDirectConnectGatewayName() {
        return this.DirectConnectGatewayName;
    }

    /**
     * Set Direct connect gateway can be named freely, but the maximum length is 60 characters.
     * @param DirectConnectGatewayName Direct connect gateway can be named freely, but the maximum length is 60 characters.
     */
    public void setDirectConnectGatewayName(String DirectConnectGatewayName) {
        this.DirectConnectGatewayName = DirectConnectGatewayName;
    }

    /**
     * Get CCN route learning type. Available values: `BGP` (Automatic learning), `STATIC` (Static, that is, user-configured). Modifying `CcnRouteType` is only possible if the Direct Connect is CCN-type and the BGP function is enabled. 
     * @return CcnRouteType CCN route learning type. Available values: `BGP` (Automatic learning), `STATIC` (Static, that is, user-configured). Modifying `CcnRouteType` is only possible if the Direct Connect is CCN-type and the BGP function is enabled.
     */
    public String getCcnRouteType() {
        return this.CcnRouteType;
    }

    /**
     * Set CCN route learning type. Available values: `BGP` (Automatic learning), `STATIC` (Static, that is, user-configured). Modifying `CcnRouteType` is only possible if the Direct Connect is CCN-type and the BGP function is enabled.
     * @param CcnRouteType CCN route learning type. Available values: `BGP` (Automatic learning), `STATIC` (Static, that is, user-configured). Modifying `CcnRouteType` is only possible if the Direct Connect is CCN-type and the BGP function is enabled.
     */
    public void setCcnRouteType(String CcnRouteType) {
        this.CcnRouteType = CcnRouteType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DirectConnectGatewayId", this.DirectConnectGatewayId);
        this.setParamSimple(map, prefix + "DirectConnectGatewayName", this.DirectConnectGatewayName);
        this.setParamSimple(map, prefix + "CcnRouteType", this.CcnRouteType);

    }
}

