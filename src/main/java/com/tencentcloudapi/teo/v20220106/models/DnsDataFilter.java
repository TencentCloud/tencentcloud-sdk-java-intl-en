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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DnsDataFilter extends AbstractModel{

    /**
    * Parameter name. Valid values:
`zone`: Site name
`host`: Domain name
`type`: DNS resolution type
`code`: DNS response code
`area`: Region of the resolution server
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Parameter value
When `Name=area`, valid values:
`Asia`
`Europe`
`Africa`
`Oceania`
`Americas`

When `Name=code`, valid values:
`NoError`: Successful response.
`NXDomain`: Non-existent domain in the request. It is only valid when the response is from the authoritative name server.
`NotImp`: Request type not supported.
`Refused`: The name server refuses to perform the requested operation for policy reasons.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Parameter value
When `Name=area`, valid values:
`Asia`
`Europe`
`Africa`
`Oceania`
`Americas`

When `Name=code`, valid values:
`NoError`: Successful response.
`NXDomain`: Non-existent domain in the request. It is only valid when the response is from the authoritative name server.
`NotImp`: Request type not supported.
`Refused`: The name server refuses to perform the requested operation for policy reasons.
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get Parameter name. Valid values:
`zone`: Site name
`host`: Domain name
`type`: DNS resolution type
`code`: DNS response code
`area`: Region of the resolution server 
     * @return Name Parameter name. Valid values:
`zone`: Site name
`host`: Domain name
`type`: DNS resolution type
`code`: DNS response code
`area`: Region of the resolution server
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Parameter name. Valid values:
`zone`: Site name
`host`: Domain name
`type`: DNS resolution type
`code`: DNS response code
`area`: Region of the resolution server
     * @param Name Parameter name. Valid values:
`zone`: Site name
`host`: Domain name
`type`: DNS resolution type
`code`: DNS response code
`area`: Region of the resolution server
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Parameter value
When `Name=area`, valid values:
`Asia`
`Europe`
`Africa`
`Oceania`
`Americas`

When `Name=code`, valid values:
`NoError`: Successful response.
`NXDomain`: Non-existent domain in the request. It is only valid when the response is from the authoritative name server.
`NotImp`: Request type not supported.
`Refused`: The name server refuses to perform the requested operation for policy reasons. 
     * @return Value Parameter value
When `Name=area`, valid values:
`Asia`
`Europe`
`Africa`
`Oceania`
`Americas`

When `Name=code`, valid values:
`NoError`: Successful response.
`NXDomain`: Non-existent domain in the request. It is only valid when the response is from the authoritative name server.
`NotImp`: Request type not supported.
`Refused`: The name server refuses to perform the requested operation for policy reasons.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Parameter value
When `Name=area`, valid values:
`Asia`
`Europe`
`Africa`
`Oceania`
`Americas`

When `Name=code`, valid values:
`NoError`: Successful response.
`NXDomain`: Non-existent domain in the request. It is only valid when the response is from the authoritative name server.
`NotImp`: Request type not supported.
`Refused`: The name server refuses to perform the requested operation for policy reasons.
     * @param Value Parameter value
When `Name=area`, valid values:
`Asia`
`Europe`
`Africa`
`Oceania`
`Americas`

When `Name=code`, valid values:
`NoError`: Successful response.
`NXDomain`: Non-existent domain in the request. It is only valid when the response is from the authoritative name server.
`NotImp`: Request type not supported.
`Refused`: The name server refuses to perform the requested operation for policy reasons.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Parameter value
When `Name=area`, valid values:
`Asia`
`Europe`
`Africa`
`Oceania`
`Americas`

When `Name=code`, valid values:
`NoError`: Successful response.
`NXDomain`: Non-existent domain in the request. It is only valid when the response is from the authoritative name server.
`NotImp`: Request type not supported.
`Refused`: The name server refuses to perform the requested operation for policy reasons. 
     * @return Values Parameter value
When `Name=area`, valid values:
`Asia`
`Europe`
`Africa`
`Oceania`
`Americas`

When `Name=code`, valid values:
`NoError`: Successful response.
`NXDomain`: Non-existent domain in the request. It is only valid when the response is from the authoritative name server.
`NotImp`: Request type not supported.
`Refused`: The name server refuses to perform the requested operation for policy reasons.
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set Parameter value
When `Name=area`, valid values:
`Asia`
`Europe`
`Africa`
`Oceania`
`Americas`

When `Name=code`, valid values:
`NoError`: Successful response.
`NXDomain`: Non-existent domain in the request. It is only valid when the response is from the authoritative name server.
`NotImp`: Request type not supported.
`Refused`: The name server refuses to perform the requested operation for policy reasons.
     * @param Values Parameter value
When `Name=area`, valid values:
`Asia`
`Europe`
`Africa`
`Oceania`
`Americas`

When `Name=code`, valid values:
`NoError`: Successful response.
`NXDomain`: Non-existent domain in the request. It is only valid when the response is from the authoritative name server.
`NotImp`: Request type not supported.
`Refused`: The name server refuses to perform the requested operation for policy reasons.
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public DnsDataFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DnsDataFilter(DnsDataFilter source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

