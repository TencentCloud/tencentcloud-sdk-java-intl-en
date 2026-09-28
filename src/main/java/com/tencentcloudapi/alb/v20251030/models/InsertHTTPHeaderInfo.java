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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InsertHTTPHeaderInfo extends AbstractModel {

    /**
    * Key of the inserted HTTP Header. Length: 1–40 characters. Supported character sets: a-z, a-z, 0-9, -, and _.
Chinese characters are not allowed. No support for Cookie, Host, Content-Length, Connection, Upgrade, transfer-encoding, keep-alive, te, authority, x-forwarded-for, x-forwarded-proto, x-forwarded-host, and x-forwarded-port.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Type of the HTTP Header value.
When ValueType is SystemDefined, the value range is as follows: ClientPort: client port, ClientIp: client IP address, Protocol: protocol of client requests, CLBPort: listening port of the load balancing instance.
When ValueType is UserDefined, it is a printable character of 1 to 128 characters in length. It does not support ". It cannot be space at the beginning and ending, and cannot be \ at the end.
When ValueType is ReferenceHeader, refer to a header in the request header. It must be 1–128 printable characters. It does not support ". It cannot begin or end with a space, and cannot end with \.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * Type of the HTTP Header value. Value:
SystemDefined: system defined header.
UserDefined: user-defined header.
ReferenceHeader: refers to one header in the request header.
    */
    @SerializedName("ValueType")
    @Expose
    private String ValueType;

    /**
     * Get Key of the inserted HTTP Header. Length: 1–40 characters. Supported character sets: a-z, a-z, 0-9, -, and _.
Chinese characters are not allowed. No support for Cookie, Host, Content-Length, Connection, Upgrade, transfer-encoding, keep-alive, te, authority, x-forwarded-for, x-forwarded-proto, x-forwarded-host, and x-forwarded-port. 
     * @return Key Key of the inserted HTTP Header. Length: 1–40 characters. Supported character sets: a-z, a-z, 0-9, -, and _.
Chinese characters are not allowed. No support for Cookie, Host, Content-Length, Connection, Upgrade, transfer-encoding, keep-alive, te, authority, x-forwarded-for, x-forwarded-proto, x-forwarded-host, and x-forwarded-port.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Key of the inserted HTTP Header. Length: 1–40 characters. Supported character sets: a-z, a-z, 0-9, -, and _.
Chinese characters are not allowed. No support for Cookie, Host, Content-Length, Connection, Upgrade, transfer-encoding, keep-alive, te, authority, x-forwarded-for, x-forwarded-proto, x-forwarded-host, and x-forwarded-port.
     * @param Key Key of the inserted HTTP Header. Length: 1–40 characters. Supported character sets: a-z, a-z, 0-9, -, and _.
Chinese characters are not allowed. No support for Cookie, Host, Content-Length, Connection, Upgrade, transfer-encoding, keep-alive, te, authority, x-forwarded-for, x-forwarded-proto, x-forwarded-host, and x-forwarded-port.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Type of the HTTP Header value.
When ValueType is SystemDefined, the value range is as follows: ClientPort: client port, ClientIp: client IP address, Protocol: protocol of client requests, CLBPort: listening port of the load balancing instance.
When ValueType is UserDefined, it is a printable character of 1 to 128 characters in length. It does not support ". It cannot be space at the beginning and ending, and cannot be \ at the end.
When ValueType is ReferenceHeader, refer to a header in the request header. It must be 1–128 printable characters. It does not support ". It cannot begin or end with a space, and cannot end with \. 
     * @return Value Type of the HTTP Header value.
When ValueType is SystemDefined, the value range is as follows: ClientPort: client port, ClientIp: client IP address, Protocol: protocol of client requests, CLBPort: listening port of the load balancing instance.
When ValueType is UserDefined, it is a printable character of 1 to 128 characters in length. It does not support ". It cannot be space at the beginning and ending, and cannot be \ at the end.
When ValueType is ReferenceHeader, refer to a header in the request header. It must be 1–128 printable characters. It does not support ". It cannot begin or end with a space, and cannot end with \.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Type of the HTTP Header value.
When ValueType is SystemDefined, the value range is as follows: ClientPort: client port, ClientIp: client IP address, Protocol: protocol of client requests, CLBPort: listening port of the load balancing instance.
When ValueType is UserDefined, it is a printable character of 1 to 128 characters in length. It does not support ". It cannot be space at the beginning and ending, and cannot be \ at the end.
When ValueType is ReferenceHeader, refer to a header in the request header. It must be 1–128 printable characters. It does not support ". It cannot begin or end with a space, and cannot end with \.
     * @param Value Type of the HTTP Header value.
When ValueType is SystemDefined, the value range is as follows: ClientPort: client port, ClientIp: client IP address, Protocol: protocol of client requests, CLBPort: listening port of the load balancing instance.
When ValueType is UserDefined, it is a printable character of 1 to 128 characters in length. It does not support ". It cannot be space at the beginning and ending, and cannot be \ at the end.
When ValueType is ReferenceHeader, refer to a header in the request header. It must be 1–128 printable characters. It does not support ". It cannot begin or end with a space, and cannot end with \.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get Type of the HTTP Header value. Value:
SystemDefined: system defined header.
UserDefined: user-defined header.
ReferenceHeader: refers to one header in the request header. 
     * @return ValueType Type of the HTTP Header value. Value:
SystemDefined: system defined header.
UserDefined: user-defined header.
ReferenceHeader: refers to one header in the request header.
     */
    public String getValueType() {
        return this.ValueType;
    }

    /**
     * Set Type of the HTTP Header value. Value:
SystemDefined: system defined header.
UserDefined: user-defined header.
ReferenceHeader: refers to one header in the request header.
     * @param ValueType Type of the HTTP Header value. Value:
SystemDefined: system defined header.
UserDefined: user-defined header.
ReferenceHeader: refers to one header in the request header.
     */
    public void setValueType(String ValueType) {
        this.ValueType = ValueType;
    }

    public InsertHTTPHeaderInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InsertHTTPHeaderInfo(InsertHTTPHeaderInfo source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.ValueType != null) {
            this.ValueType = new String(source.ValueType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "ValueType", this.ValueType);

    }
}

