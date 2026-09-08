/*
 * Copyright 2026 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.ui.util

object TestDataConstants {

  // ==== Auth
  // --  Confidence level
  final val lowConfidence: String  = "50"
  final val highConfidence: String = "250"

  // -- Affinity Group
  final val affinityIndividual: String   = "Individual"
  final val affinityOrganisation: String = "Organisation"
  final val affinityAgent: String        = "Agent"

  // -- Enrolment Key
  final val enrolmentLegacy: String  = "IR-SA"
  final val enrolmentMTDITID: String = "HMRC-MTD-IT"

  // ==== Test data
  // -- Common
  final val dateOfDoB: String                   = "01"
  final val monthOfDoB: String                  = "01"
  final val yearOfDoB: String                   = "2000"
  final val ukCountry: String                   = "United Kingdom"
  final val nonUkCountry: String                = "India"
  final val emailAddress: String                = "abcd@xyz.com"
  final val contactNumber: String               = "+44 1234567890"
  final val registrationComplete: String        = "Registration complete"
  final val addressLine1: String                = "A1"
  final val nonUkPostCode: String               = "123456"
  final val companyRegistrationNumber: String   = "AB123456"
  final val companyRegistrationNumberSL: String = "01234567"
  final val companyRegistrationNumberRS: String = "21436587"
  final val utr: String                         = "1234567890"
  final val utrRS: String                       = "5432167812"
  final val postcodeSL: String                  = "AA1 1AA"
  final val waitFor10Secs: Int                  = 10000
  final val waitFor5Sec: Int                    = 5000
  final val noOfIterations: Int                 = 10
  final val maxRetries: Int                     = 5

  // -- Local
  final val ukPostCode: String = "ZZ11ZZ"

  // -- QA
  final val ukPostCodeQA: String = "NE32 5JU"
}
