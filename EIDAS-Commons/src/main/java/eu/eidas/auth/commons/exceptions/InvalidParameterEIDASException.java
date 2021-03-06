/* 
#   Copyright (c) 2017 European Commission  
#   Licensed under the EUPL, Version 1.2 or – as soon they will be 
#   approved by the European Commission - subsequent versions of the 
#    EUPL (the "Licence"); 
#    You may not use this work except in compliance with the Licence. 
#    You may obtain a copy of the Licence at: 
#    * https://joinup.ec.europa.eu/page/eupl-text-11-12  
#    *
#    Unless required by applicable law or agreed to in writing, software 
#    distributed under the Licence is distributed on an "AS IS" basis, 
#    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
#    See the Licence for the specific language governing permissions and limitations under the Licence.
 */
/*
 * This work is Open Source and licensed by the European Commission under the
 * conditions of the European Public License v1.1 
 *  
 * (http://www.osor.eu/eupl/european-union-public-licence-eupl-v.1.1); 
 * 
 * any use of this file implies acceptance of the conditions of this license. 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS,  WITHOUT 
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the 
 * License for the specific language governing permissions and limitations 
 * under the License.
 */
package eu.eidas.auth.commons.exceptions;

/**
 * Invalid Parameter Exception class.
 * 
 * @see InvalidParameterEIDASException
 */
public class InvalidParameterEIDASException extends AbstractEIDASException {
  
  /**
   * Unique identifier.
   */
  private static final long serialVersionUID = 2046282148740524875L;
  
  /**
   * Exception Constructor with two Strings representing the errorCode and
   * errorMessage as parameters.
   * 
   * @param errorCode The error code value.
   * @param errorMessage The error code message value.
   */
  public InvalidParameterEIDASException(final String errorCode,
    final String errorMessage) {
    super(errorCode, errorMessage);
  }

  /**
   * Exception Constructor with two Strings representing the errorCode and errorMessage as parameters and the
   * Throwable cause.
   *
   * @param errorCode The error code value.
   * @param errorMessage The error code message value.
   * @param cause The throwable object.
   */
  public InvalidParameterEIDASException(final String errorCode, final String errorMessage, final Throwable cause) {
    super(errorCode, errorMessage, cause);
  }
  
  /**
   * Exception Constructor with one String representing the encoded samlToken.
   * 
   * @param samlTokenFail The error SAML Token.
   */
  public InvalidParameterEIDASException(final String samlTokenFail) {
    super(samlTokenFail);
  }
  
}
